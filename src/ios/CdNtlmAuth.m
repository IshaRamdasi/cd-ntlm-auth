#import "CdNtlmAuth.h"

#import <Cordova/CDVAvailability.h>

@implementation CdNtlmAuth

- (void)pluginInitialize {
}


- (void)download:(CDVInvokedUrlCommand *)command {
  NSString* link = [command.arguments objectAtIndex:0];
  NSLog(@"%@", link);
  CDVPluginResult *result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:link];
  //[CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR messageAsString:@"err msg"]; this line for error
  [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
}

@end
