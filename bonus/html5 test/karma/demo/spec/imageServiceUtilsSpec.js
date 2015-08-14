define([
  'dojo/dom-construct',
  'esri/map',
  'esri-utils/imageServiceUtils'
], function(
  domConstruct,
  Map,
  imageServiceUtils
) {

  describe('map tests', function() {
    var map;

    // create the map
    beforeEach(function() {
      var div = domConstruct.create('div', {style: 'width:300px;height:200px'});
      map = new Map(div, {
          basemap: "topo",
          center: [-122.45, 37.75],
          zoom: 13,
          sliderStyle: "small"
      });
      console.log('created map');
    });

    // destroy the map
    afterEach(function() {
      map.destroy();
      map = null;
    });

    describe('when setting layer url', function() {
      var url;

      // default image service
      beforeEach(function() {
        url = "/arcgis/rest/services/LandsatGLS/FalseColor/ImageServer";
      });

      // specs
      it("should add the layer if not already added", function(done) {
        var options = {id: 'myLayerId'},
          myLayer;
        map.on('layer-add-result', function(e) {
          console.log(e.layer.id, e.layer.url);
          if (e.layer.url === url) {
            myLayer = e.layer;
            expect(myLayer).toBeDefined();
            expect(myLayer.id).toEqual(options.id);
            expect(myLayer.url).toEqual(url);
            done();
          }
        });
        imageServiceUtils.setUrl(map, url, options);
      });

      it("should replace the layer if already added", function(done) {
        var options = {id: 'myLayerId'},
          replaceUrl = '/arcgis/rest/services/LandsatGLS/GLS2010_Enhanced/ImageServer',
          myLayer;
        // after each layer has been added
        map.on('layer-add-result', function(e) {
          console.log(e.layer.id, e.layer.url);
          if (e.layer.url === url) {
            // layer added for the first time
            myLayer = e.layer;
            expect(myLayer).toBeDefined();
            expect(myLayer.id).toEqual(options.id);
            expect(myLayer.url).toEqual(url);

            // now let's update the layer and re test
            imageServiceUtils.setUrl(map, replaceUrl, options);
          } else if (e.layer.url === replaceUrl) {
            // second time
            // - id should be same, but url updated
            myLayer = e.layer;
            expect(myLayer).toBeDefined();
            expect(myLayer.id).toEqual(options.id);
            expect(myLayer.url).toEqual(replaceUrl);
            done();
          }
        });
        imageServiceUtils.setUrl(map, url, options);
      });
    });
  });
});
