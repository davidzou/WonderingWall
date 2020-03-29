import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:use_sample_demo/use_sample_demo.dart';

void main() {
  const MethodChannel channel = MethodChannel('use_sample_demo');

  TestWidgetsFlutterBinding.ensureInitialized();

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await UseSampleDemo.platformVersion, '42');
  });
}
