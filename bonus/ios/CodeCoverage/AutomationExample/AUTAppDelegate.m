//
//  AUTAppDelegate.m
//  AutomationExample
//
//  Created by Jonathan Penn on 6/28/12.
//  Copyright (c) 2012 Navel Labs. All rights reserved.
//

#import "AUTAppDelegate.h"

@implementation AUTAppDelegate

@synthesize window = _window;

extern void __gcov_flush(void);

- (void)applicationDidEnterBackground:(UIApplication *)application {
#ifdef DEBUG 
    __gcov_flush();
    // flush code coverage data
#endif 
}
    
- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
{
    // Override point for customization after application launch.
    return YES;
}

@end
