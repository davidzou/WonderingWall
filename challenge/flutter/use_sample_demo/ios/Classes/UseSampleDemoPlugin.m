#import "UseSampleDemoPlugin.h"
#if __has_include(<use_sample_demo/use_sample_demo-Swift.h>)
#import <use_sample_demo/use_sample_demo-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "use_sample_demo-Swift.h"
#endif

@implementation UseSampleDemoPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftUseSampleDemoPlugin registerWithRegistrar:registrar];
}
@end
