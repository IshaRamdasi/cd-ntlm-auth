#import <Cordova/CDVPlugin.h>

@interface CdNtlmAuth : CDVPlugin {
}

// The hooks for our plugin commands
- (void)download:(CDVInvokedUrlCommand *)command;

@end
