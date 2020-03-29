import 'dart:async';

import 'package:flutter/services.dart';

class UseSampleDemo {
  static const MethodChannel _channel =
      const MethodChannel('use_sample_demo');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
