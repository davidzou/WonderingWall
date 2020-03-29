Command -- *` create `*
====

***

### 索引

* [描述](#description)

* [详解](#details)

    1. [`flutter create my_first_flutter_demo`](#create_default)
    1. [`flutter create --list-samples=samples_all.json`](#create_list_samples)
    2. [`flutter create --sample=widgets.Flow.1 --no-pub --offline use_sample_demo1`](#create_custom_sample)
    3. [`flutter create --sample=widgets.Flow.1 --offline --overwrite use_sample_demo1`](#create_custom_sample_overwrite)
    4. [`flutter create [-h | --help]`](#create_help)

* [帮助文档](#help_doc)

***

### 描述<a name="description"></a>

__用于显示当前Flutter版本，版本操作__

***

### 详解<a name="details"></a>
* `flutter create my_first_flutter_demo` <a name="create_default"></a>

    默认方式创建Flutter项目，只是用`my_first_flutter_demo`作为项目名称。

* `flutter create --list-samples=samples_all.json`<a name="create_list_samples"></a>

    列出所有可用的Sample模板。通过模板ID创建对应项目。

    ```
    zzw:flutter zzw$ flutter create --list-samples=samples_all.json
    Wrote samples JSON to "samples_all.json"
    zzw:flutter zzw$ cat samples_all.json | jq .
    [
      {
        "sourcePath": "lib/src/widgets/sliver.dart",
        "sourceLine": 1680,
        "id": "widgets.SliverFillRemaining.4",
        "serial": "4",
        "package": "flutter",
        "library": "widgets",
        "element": "SliverFillRemaining",
        "file": "widgets.SliverFillRemaining.4.dart",
        "description": "In this sample the [SliverFillRemaining]'s child stretches to fill the\noverscroll area when [fillOverscroll] is true. This sample also features a\nbutton that is pinned to the bottom of the sliver, regardless of size or\noverscroll behavior. Try switching [fillOverscroll] to see the difference."
      },
      {
        "sourcePath": "lib/src/material/scaffold.dart",
        "sourceLine": 1310,
        "id": "material.Scaffold.of.2",
        "serial": "2",
        "package": "flutter",
        "library": "material",
        "element": "Scaffold.of",
        "file": "material.Scaffold.of.2.dart",
        "description": "When the [Scaffold] is actually created in the same `build` function, the\n`context` argument to the `build` function can't be used to find the\n[Scaffold] (since it's \"above\" the widget being returned in the widget\ntree). In such cases, the following technique with a [Builder] can be used\nto provide a new scope with a [BuildContext] that is \"under\" the\n[Scaffold]:"
      },
      {
        "sourcePath": "lib/src/material/about.dart",
        "sourceLine": 107,
        "id": "material.AboutListTile.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "AboutListTile",
        "file": "material.AboutListTile.1.dart",
        "description": "This sample shows two ways to open [AboutDialog]. The first one\nuses an [AboutListTile], and the second uses the [showAboutDialog] function."
      },
      {
        "sourcePath": "lib/src/widgets/focus_scope.dart",
        "sourceLine": 135,
        "id": "widgets.Focus.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "Focus",
        "file": "widgets.Focus.1.dart",
        "description": "This example shows how to manage focus using the [Focus] and [FocusScope]\nwidgets. See [FocusNode] for a similar example that doesn't use [Focus] or\n[FocusScope]."
      },
      {
        "sourcePath": "lib/src/widgets/sliver.dart",
        "sourceLine": 1680,
        "id": "widgets.SliverFillRemaining.3",
        "serial": "3",
        "package": "flutter",
        "library": "widgets",
        "element": "SliverFillRemaining",
        "file": "widgets.SliverFillRemaining.3.dart",
        "description": "In this sample the [SliverFillRemaining] defers to the size of its [child]\nbecause the [precedingScrollExtent] of the [SliverConstraints] has gone\nbeyond that of the viewport's main axis."
      },
      {
        "sourcePath": "lib/src/material/switch_list_tile.dart",
        "sourceLine": 245,
        "id": "material.SwitchListTile.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "SwitchListTile",
        "file": "material.SwitchListTile.1.dart",
        "description": "![SwitchListTile sample](https://flutter.github.io/assets-for-api-docs/assets/material/switch_list_tile.png)\n\nThis widget shows a switch that, when toggled, changes the state of a [bool]\nmember field called `_lights`."
      },
      {
        "sourcePath": "lib/src/material/app_bar.dart",
        "sourceLine": 166,
        "id": "material.AppBar.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "AppBar",
        "file": "material.AppBar.1.dart",
        "description": "This sample shows an [AppBar] with two simple actions. The first action\nopens a [SnackBar], while the second action navigates to a new page."
      },
      {
        "sourcePath": "lib/src/services/keyboard_key.dart",
        "sourceLine": 124,
        "id": "services.LogicalKeyboardKey.1",
        "serial": "1",
        "package": "flutter",
        "library": "services",
        "element": "LogicalKeyboardKey",
        "file": "services.LogicalKeyboardKey.1.dart",
        "description": "This example shows how to detect if the user has selected the logical \"Q\"\nkey."
      },
      {
        "sourcePath": "lib/src/material/checkbox_list_tile.dart",
        "sourceLine": 240,
        "id": "material.CheckboxListTile.3",
        "serial": "3",
        "package": "flutter",
        "library": "material",
        "element": "CheckboxListTile",
        "file": "material.CheckboxListTile.3.dart",
        "description": "![Custom checkbox list tile sample](https://flutter.github.io/assets-for-api-docs/assets/material/checkbox_list_tile_custom.png)\n\nHere is an example of a custom LabeledCheckbox widget, but you can easily\nmake your own configurable widget."
      },
      {
        "sourcePath": "lib/src/material/list_tile.dart",
        "sourceLine": 622,
        "id": "material.ListTile.5",
        "serial": "5",
        "package": "flutter",
        "library": "material",
        "element": "ListTile",
        "file": "material.ListTile.5.dart",
        "description": "Here is an example of an article list item with multiline titles and\nsubtitles. It utilizes [Row]s and [Column]s, as well as [Expanded] and\n[AspectRatio] widgets to organize its layout.\n\n![Custom list item b](https://flutter.github.io/assets-for-api-docs/assets/widgets/custom_list_item_b.png)"
      },
      {
        "sourcePath": "lib/src/widgets/editable_text.dart",
        "sourceLine": 833,
        "id": "widgets.EditableText.onChanged.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "EditableText.onChanged",
        "file": "widgets.EditableText.onChanged.1.dart",
        "description": "This example shows how onChanged could be used to check the TextField's\ncurrent value each time the user inserts or deletes a character."
      },
      {
        "sourcePath": "lib/src/material/bottom_navigation_bar.dart",
        "sourceLine": 137,
        "id": "material.BottomNavigationBar.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "BottomNavigationBar",
        "file": "material.BottomNavigationBar.1.dart",
        "description": "This example shows a [BottomNavigationBar] as it is used within a [Scaffold]\nwidget. The [BottomNavigationBar] has three [BottomNavigationBarItem]\nwidgets and the [currentIndex] is set to index 0. The selected item is\namber. The `_onItemTapped` function changes the selected item's index\nand displays a corresponding message in the center of the [Scaffold].\n\n![A scaffold with a bottom navigation bar containing three bottom navigation\nbar items. The first one is selected.](https://flutter.github.io/assets-for-api-docs/assets/material/bottom_navigation_bar.png)"
      },
      {
        "sourcePath": "lib/src/widgets/editable_text.dart",
        "sourceLine": 916,
        "id": "widgets.EditableText.onSubmitted.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "EditableText.onSubmitted",
        "file": "widgets.EditableText.onSubmitted.1.dart",
        "description": "When a non-completion action is pressed, such as \"next\" or \"previous\", it\nis often desirable to move the focus to the next or previous field.  To do\nthis, handle it as in this example, by calling [FocusNode.focusNext] in\nthe [TextFormField.onFieldSubmitted] callback ([TextFormField] wraps\n[EditableText] internally, and uses the value of `onFieldSubmitted` as its\n[onSubmitted])."
      },
      {
        "sourcePath": "lib/src/widgets/implicit_animations.dart",
        "sourceLine": 626,
        "id": "widgets.AnimatedContainer.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "AnimatedContainer",
        "file": "widgets.AnimatedContainer.1.dart",
        "description": "The following example (depicted above) transitions an AnimatedContainer\nbetween two states. It adjusts the [height], [width], [color], and\n[alignment] properties when tapped."
      },
      {
        "sourcePath": "lib/src/widgets/basic.dart",
        "sourceLine": 5833,
        "id": "widgets.MouseRegion.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "MouseRegion",
        "file": "widgets.MouseRegion.1.dart",
        "description": "This example makes a [Container] react to being entered by a mouse\npointer, showing a count of the number of entries and exits."
      },
      {
        "sourcePath": "lib/src/widgets/inherited_theme.dart",
        "sourceLine": 87,
        "id": "widgets.InheritedTheme.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "InheritedTheme",
        "file": "widgets.InheritedTheme.1.dart",
        "description": "This example demonstrates how `InheritedTheme.captureAll()` can be used\nto wrap the contents of a new route with the inherited themes that\nare present when the route is built - but are not present when route\nis actually shown.\n\nIf the same code is run without `InheritedTheme.captureAll(), the\nnew route's Text widget will inherit the \"something must be wrong\"\nfallback text style, rather than the default text style defined in MyApp."
      },
      {
        "sourcePath": "lib/src/material/checkbox_list_tile.dart",
        "sourceLine": 240,
        "id": "material.CheckboxListTile.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "CheckboxListTile",
        "file": "material.CheckboxListTile.1.dart",
        "description": "![CheckboxListTile sample](https://flutter.github.io/assets-for-api-docs/assets/material/checkbox_list_tile.png)\n\nThis widget shows a checkbox that, when checked, slows down all animations\n(including the animation of the checkbox itself getting checked!).\n\nThis sample requires that you also import 'package:flutter/scheduler.dart',\nso that you can reference [timeDilation]."
      },
      {
        "sourcePath": "lib/src/material/flexible_space_bar.dart",
        "sourceLine": 141,
        "id": "material.FlexibleSpaceBar.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "FlexibleSpaceBar",
        "file": "material.FlexibleSpaceBar.1.dart",
        "description": "This sample application demonstrates the different features of the\n[FlexibleSpaceBar] when used in a [SliverAppBar]. This app bar is configured\nto stretch into the overscroll space, and uses the\n[FlexibleSpaceBar.stretchModes] to apply `fadeTitle`, `blurBackground` and\n`zoomBackground`. The app bar also makes use of [CollapseMode.parallax] by\ndefault."
      },
      {
        "sourcePath": "lib/src/material/dropdown.dart",
        "sourceLine": 771,
        "id": "material.DropdownButton.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "DropdownButton",
        "file": "material.DropdownButton.1.dart",
        "description": "This sample shows a `DropdownButton` with a large arrow icon,\npurple text style, and bold purple underline, whose value is one of \"One\",\n\"Two\", \"Free\", or \"Four\".\n\n![](https://flutter.github.io/assets-for-api-docs/assets/material/dropdown_button.png)"
      },
      {
        "sourcePath": "lib/src/services/keyboard_key.dart",
        "sourceLine": 2034,
        "id": "services.PhysicalKeyboardKey.1",
        "serial": "1",
        "package": "flutter",
        "library": "services",
        "element": "PhysicalKeyboardKey",
        "file": "services.PhysicalKeyboardKey.1.dart",
        "description": "This example shows how to detect if the user has selected the physical key\nto the right of the CAPS LOCK key."
      },
      {
        "sourcePath": "lib/src/widgets/editable_text.dart",
        "sourceLine": 120,
        "id": "widgets.TextEditingController.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "TextEditingController",
        "file": "widgets.TextEditingController.1.dart",
        "description": "This example creates a [TextField] with a [TextEditingController] whose\nchange listener forces the entered text to be lower case and keeps the\ncursor at the end of the input."
      },
      {
        "sourcePath": "lib/src/material/scaffold.dart",
        "sourceLine": 979,
        "id": "material.Scaffold.2",
        "serial": "2",
        "package": "flutter",
        "library": "material",
        "element": "Scaffold",
        "file": "material.Scaffold.2.dart",
        "description": "This example shows a [Scaffold] with a blueGrey [backgroundColor], [body]\nand [FloatingActionButton]. The [body] is a [Text] placed in a [Center] in\norder to center the text within the [Scaffold]. The [FloatingActionButton]\nis connected to a callback that increments a counter.\n\n![](https://flutter.github.io/assets-for-api-docs/assets/material/scaffold_background_color.png)"
      },
      {
        "sourcePath": "lib/src/widgets/basic.dart",
        "sourceLine": 4515,
        "id": "widgets.Expanded.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "Expanded",
        "file": "widgets.Expanded.1.dart",
        "description": "This example shows how to use an [Expanded] widget in a [Column] so that\nit's middle child, a [Container] here, expands to fill the space.\n\n![This results in two thin blue boxes with a larger amber box in between.](https://flutter.github.io/assets-for-api-docs/assets/widgets/expanded_column.png)"
      },
      {
        "sourcePath": "lib/src/widgets/framework.dart",
        "sourceLine": 4047,
        "id": "widgets.ErrorWidget.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "ErrorWidget",
        "file": "widgets.ErrorWidget.1.dart",
        "description": ""
      },
      {
        "sourcePath": "lib/src/widgets/navigator.dart",
        "sourceLine": 766,
        "id": "widgets.Navigator.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "Navigator",
        "file": "widgets.Navigator.1.dart",
        "description": "The following example demonstrates how a nested [Navigator] can be used to\npresent a standalone user registration journey.\n\nEven though this example uses two [Navigator]s to demonstrate nested\n[Navigator]s, a similar result is possible using only a single [Navigator].\n\nRun this example with `flutter run --route=/signup` to start it with\nthe signup flow instead of on the home page."
      },
      {
        "sourcePath": "lib/src/material/scaffold.dart",
        "sourceLine": 979,
        "id": "material.Scaffold.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "Scaffold",
        "file": "material.Scaffold.1.dart",
        "description": "This example shows a [Scaffold] with a [body] and [FloatingActionButton].\nThe [body] is a [Text] placed in a [Center] in order to center the text\nwithin the [Scaffold]. The [FloatingActionButton] is connected to a\ncallback that increments a counter.\n\n![The Scaffold has a white background with a blue AppBar at the top. A blue FloatingActionButton is positioned at the bottom right corner of the Scaffold.](https://flutter.github.io/assets-for-api-docs/assets/material/scaffold.png)"
      },
      {
        "sourcePath": "lib/src/widgets/focus_manager.dart",
        "sourceLine": 366,
        "id": "widgets.FocusNode.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "FocusNode",
        "file": "widgets.FocusNode.1.dart",
        "description": "This example shows how a FocusNode should be managed if not using the\n[Focus] or [FocusScope] widgets. See the [Focus] widget for a similar\nexample using [Focus] and [FocusScope] widgets."
      },
      {
        "sourcePath": "lib/src/material/switch_list_tile.dart",
        "sourceLine": 245,
        "id": "material.SwitchListTile.2",
        "serial": "2",
        "package": "flutter",
        "library": "material",
        "element": "SwitchListTile",
        "file": "material.SwitchListTile.2.dart",
        "description": "![Switch list tile semantics sample](https://flutter.github.io/assets-for-api-docs/assets/material/switch_list_tile_semantics.png)\n\nHere is an example of a custom labeled radio widget, called\nLinkedLabelRadio, that includes an interactive [RichText] widget that\nhandles tap gestures."
      },
      {
        "sourcePath": "lib/src/material/text_field.dart",
        "sourceLine": 244,
        "id": "material.TextField.2",
        "serial": "2",
        "package": "flutter",
        "library": "material",
        "element": "TextField",
        "file": "material.TextField.2.dart",
        "description": "This sample shows how to get a value from a TextField via the [onSubmitted]\ncallback."
      },
      {
        "sourcePath": "lib/src/material/dropdown.dart",
        "sourceLine": 905,
        "id": "material.DropdownButton.selectedItemBuilder.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "DropdownButton.selectedItemBuilder",
        "file": "material.DropdownButton.selectedItemBuilder.1.dart",
        "description": "This sample shows a `DropdownButton` with a button with [Text] that\ncorresponds to but is unique from [DropdownMenuItem]."
      },
      {
        "sourcePath": "lib/src/widgets/basic.dart",
        "sourceLine": 4515,
        "id": "widgets.Expanded.2",
        "serial": "2",
        "package": "flutter",
        "library": "widgets",
        "element": "Expanded",
        "file": "widgets.Expanded.2.dart",
        "description": "This example shows how to use an [Expanded] widget in a [Row] with multiple\nchildren expanded, utilizing the [flex] factor to prioritize available space.\n\n![This results in a wide amber box, followed by a thin blue box, with a medium width amber box at the end.](https://flutter.github.io/assets-for-api-docs/assets/widgets/expanded_row.png)"
      },
      {
        "sourcePath": "lib/src/widgets/basic.dart",
        "sourceLine": 5577,
        "id": "widgets.Listener.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "Listener",
        "file": "widgets.Listener.1.dart",
        "description": "This example makes a [Container] react to being touched, showing a count of\nthe number of pointer downs and ups."
      },
      {
        "sourcePath": "lib/src/material/floating_action_button.dart",
        "sourceLine": 122,
        "id": "material.FloatingActionButton.2",
        "serial": "2",
        "package": "flutter",
        "library": "material",
        "element": "FloatingActionButton",
        "file": "material.FloatingActionButton.2.dart",
        "description": "This example shows how to make an extended [FloatingActionButton] in a\n[Scaffold], with a  pink [backgroundColor], a thumbs up [Icon] and a\n[Text] label that reads \"Approve\".\n\n![](https://flutter.github.io/assets-for-api-docs/assets/material/floating_action_button_label.png)"
      },
      {
        "sourcePath": "lib/src/widgets/animated_list.dart",
        "sourceLine": 734,
        "id": "widgets.SliverAnimatedList.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "SliverAnimatedList",
        "file": "widgets.SliverAnimatedList.1.dart",
        "description": "This sample application uses a [SliverAnimatedList] to create an animated\neffect when items are removed or added to the list."
      },
      {
        "sourcePath": "lib/src/widgets/form.dart",
        "sourceLine": 72,
        "id": "widgets.Form.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "Form",
        "file": "widgets.Form.1.dart",
        "description": "This example shows a [Form] with one [TextFormField] to enter an email\naddress and a [RaisedButton] to submit the form. A [GlobalKey] is used here\nto identify the [Form] and validate input.\n\n![](https://flutter.github.io/assets-for-api-docs/assets/widgets/form.png)"
      },
      {
        "sourcePath": "lib/src/widgets/animated_list.dart",
        "sourceLine": 268,
        "id": "widgets.AnimatedList.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "AnimatedList",
        "file": "widgets.AnimatedList.1.dart",
        "description": "This sample application uses an [AnimatedList] to create an effect when\nitems are removed or added to the list."
      },
      {
        "sourcePath": "lib/src/material/radio_list_tile.dart",
        "sourceLine": 293,
        "id": "material.RadioListTile.2",
        "serial": "2",
        "package": "flutter",
        "library": "material",
        "element": "RadioListTile",
        "file": "material.RadioListTile.2.dart",
        "description": "![Radio list tile semantics sample](https://flutter.github.io/assets-for-api-docs/assets/material/radio_list_tile_semantics.png)\n\nHere is an example of a custom labeled radio widget, called\nLinkedLabelRadio, that includes an interactive [RichText] widget that\nhandles tap gestures."
      },
      {
        "sourcePath": "lib/src/widgets/image.dart",
        "sourceLine": 793,
        "id": "widgets.Image.loadingBuilder.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "Image.loadingBuilder",
        "file": "widgets.Image.loadingBuilder.1.dart",
        "description": "The following sample uses [loadingBuilder] to show a\n[CircularProgressIndicator] while an image loads over the network."
      },
      {
        "sourcePath": "lib/src/widgets/actions.dart",
        "sourceLine": 511,
        "id": "widgets.FocusableActionDetector.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "FocusableActionDetector",
        "file": "widgets.FocusableActionDetector.1.dart",
        "description": "This example shows how keyboard interaction can be added to a custom control\nthat changes color when hovered and focused, and can toggle a light when\nactivated, either by touch or by hitting the `X` key on the keyboard.\n\nThis example defines its own key binding for the `X` key, but in this case,\nthere is also a default key binding for [ActivateAction] in the default key\nbindings created by [WidgetsApp] (the parent for [MaterialApp], and\n[CupertinoApp]), so the `ENTER` key will also activate the control."
      },
      {
        "sourcePath": "lib/src/material/card.dart",
        "sourceLine": 96,
        "id": "material.Card.2",
        "serial": "2",
        "package": "flutter",
        "library": "material",
        "element": "Card",
        "file": "material.Card.2.dart",
        "description": "This sample shows creation of a [Card] widget that can be tapped. When\ntapped this [Card]'s [InkWell] displays an \"ink splash\" that fills the\nentire card."
      },
      {
        "sourcePath": "lib/src/widgets/sliver.dart",
        "sourceLine": 1680,
        "id": "widgets.SliverFillRemaining.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "SliverFillRemaining",
        "file": "widgets.SliverFillRemaining.1.dart",
        "description": "In this sample the [SliverFillRemaining] sizes its [child] to fill the\nremaining extent of the viewport in both axes. The icon is centered in the\nsliver, and would be in any computed extent for the sliver."
      },
      {
        "sourcePath": "lib/src/widgets/single_child_scroll_view.dart",
        "sourceLine": 196,
        "id": "widgets.SingleChildScrollView.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "SingleChildScrollView",
        "file": "widgets.SingleChildScrollView.1.dart",
        "description": "In this example, the children are spaced out equally, unless there's no more\nroom, in which case they stack vertically and scroll.\n\nWhen using this technique, [Expanded] and [Flexible] are not useful, because\nin both cases the \"available space\" is infinite (since this is in a viewport).\nThe next section describes a technique for providing a maximum height constraint."
      },
      {
        "sourcePath": "lib/src/widgets/tween_animation_builder.dart",
        "sourceLine": 114,
        "id": "widgets.TweenAnimationBuilder.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "TweenAnimationBuilder",
        "file": "widgets.TweenAnimationBuilder.1.dart",
        "description": "This example shows an [IconButton] that \"zooms\" in when the widget first\nbuilds (its size smoothly increases from 0 to 24) and whenever the button\nis pressed, it smoothly changes its size to the new target value of either\n48 or 24."
      },
      {
        "sourcePath": "lib/src/material/radio_list_tile.dart",
        "sourceLine": 293,
        "id": "material.RadioListTile.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "RadioListTile",
        "file": "material.RadioListTile.1.dart",
        "description": "![RadioListTile sample](https://flutter.github.io/assets-for-api-docs/assets/material/radio_list_tile.png)\n\nThis widget shows a pair of radio buttons that control the `_character`\nfield. The field is of the type `SingingCharacter`, an enum."
      },
      {
        "sourcePath": "lib/src/widgets/transitions.dart",
        "sourceLine": 250,
        "id": "widgets.SlideTransition.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "SlideTransition",
        "file": "widgets.SlideTransition.1.dart",
        "description": "The following code implements the [SlideTransition] as seen in the video\nabove:"
      },
      {
        "sourcePath": "lib/src/widgets/single_child_scroll_view.dart",
        "sourceLine": 196,
        "id": "widgets.SingleChildScrollView.2",
        "serial": "2",
        "package": "flutter",
        "library": "widgets",
        "element": "SingleChildScrollView",
        "file": "widgets.SingleChildScrollView.2.dart",
        "description": "In this example, the column becomes either as big as viewport, or as big as\nthe contents, whichever is biggest."
      },
      {
        "sourcePath": "lib/src/material/dropdown.dart",
        "sourceLine": 965,
        "id": "material.DropdownButton.style.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "DropdownButton.style",
        "file": "material.DropdownButton.style.1.dart",
        "description": "This sample shows a `DropdownButton` with a dropdown button text style\nthat is different than its menu items."
      },
      {
        "sourcePath": "lib/src/material/stepper.dart",
        "sourceLine": 236,
        "id": "material.Stepper.controlsBuilder.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "Stepper.controlsBuilder",
        "file": "material.Stepper.controlsBuilder.1.dart",
        "description": "Creates a stepper control with custom buttons."
      },
      {
        "sourcePath": "lib/src/material/expansion_panel.dart",
        "sourceLine": 310,
        "id": "material.ExpansionPanelList.radio.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "ExpansionPanelList.radio",
        "file": "material.ExpansionPanelList.radio.1.dart",
        "description": "Here is a simple example of how to implement ExpansionPanelList.radio."
      },
      {
        "sourcePath": "lib/src/widgets/basic.dart",
        "sourceLine": 4932,
        "id": "widgets.Flow.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "Flow",
        "file": "widgets.Flow.1.dart",
        "description": "This example uses the [Flow] widget to create a menu that opens and closes\nas it is interacted with, shown above. The color of the button in the menu\nchanges to indicate which one has been selected."
      },
      {
        "sourcePath": "lib/src/material/scaffold.dart",
        "sourceLine": 1310,
        "id": "material.Scaffold.of.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "Scaffold.of",
        "file": "material.Scaffold.of.1.dart",
        "description": "Typical usage of the [Scaffold.of] function is to call it from within the\n`build` method of a child of a [Scaffold]."
      },
      {
        "sourcePath": "lib/src/material/scaffold.dart",
        "sourceLine": 979,
        "id": "material.Scaffold.3",
        "serial": "3",
        "package": "flutter",
        "library": "material",
        "element": "Scaffold",
        "file": "material.Scaffold.3.dart",
        "description": "This example shows a [Scaffold] with an [AppBar], a [BottomAppBar] and a\n[FloatingActionButton]. The [body] is a [Text] placed in a [Center] in order\nto center the text within the [Scaffold]. The [FloatingActionButton] is\ncentered and docked within the [BottomAppBar] using\n[FloatingActionButtonLocation.centerDocked]. The [FloatingActionButton] is\nconnected to a callback that increments a counter.\n\n![](https://flutter.github.io/assets-for-api-docs/assets/material/scaffold_bottom_app_bar.png)"
      },
      {
        "sourcePath": "lib/src/services/system_chrome.dart",
        "sourceLine": 384,
        "id": "services.SystemChrome.setSystemUIOverlayStyle.2",
        "serial": "2",
        "package": "flutter",
        "library": "services",
        "element": "SystemChrome.setSystemUIOverlayStyle",
        "file": "services.SystemChrome.setSystemUIOverlayStyle.2.dart",
        "description": "The following example creates a widget that changes the status bar color\nto a random value on Android."
      },
      {
        "sourcePath": "lib/src/widgets/async.dart",
        "sourceLine": 566,
        "id": "widgets.FutureBuilder.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "FutureBuilder",
        "file": "widgets.FutureBuilder.1.dart",
        "description": "This sample shows a [FutureBuilder] that displays a loading spinner while it\nloads data. It displays a success icon and text if the [Future] completes\nwith a result, or an error icon and text if the [Future] completes with an\nerror. Assume the `_calculation` field is set by pressing a button elsewhere\nin the UI."
      },
      {
        "sourcePath": "lib/src/material/icon_button.dart",
        "sourceLine": 125,
        "id": "material.IconButton.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "IconButton",
        "file": "material.IconButton.1.dart",
        "description": "This sample shows an `IconButton` that uses the Material icon \"volume_up\" to\nincrease the volume.\n\n![](https://flutter.github.io/assets-for-api-docs/assets/material/icon_button.png)"
      },
      {
        "sourcePath": "lib/src/material/raised_button.dart",
        "sourceLine": 101,
        "id": "material.RaisedButton.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "RaisedButton",
        "file": "material.RaisedButton.1.dart",
        "description": "This sample shows how to render a disabled RaisedButton, an enabled RaisedButton\nand lastly a RaisedButton with gradient background.\n\n![Three raised buttons, one enabled, another disabled, and the last one\nstyled with a blue gradient background](https://flutter.github.io/assets-for-api-docs/assets/material/raised_button.png)"
      },
      {
        "sourcePath": "lib/src/material/chip.dart",
        "sourceLine": 239,
        "id": "material.DeletableChipAttributes.onDeleted.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "DeletableChipAttributes.onDeleted",
        "file": "material.DeletableChipAttributes.onDeleted.1.dart",
        "description": "This sample shows how to use [onDeleted] to remove an entry when the\ndelete button is tapped."
      },
      {
        "sourcePath": "lib/src/material/list_tile.dart",
        "sourceLine": 622,
        "id": "material.ListTile.4",
        "serial": "4",
        "package": "flutter",
        "library": "material",
        "element": "ListTile",
        "file": "material.ListTile.4.dart",
        "description": "Here is an example of a custom list item that resembles a Youtube related\nvideo list item created with [Expanded] and [Container] widgets.\n\n![Custom list item a](https://flutter.github.io/assets-for-api-docs/assets/widgets/custom_list_item_a.png)"
      },
      {
        "sourcePath": "lib/src/cupertino/context_menu.dart",
        "sourceLine": 122,
        "id": "cupertino.CupertinoContextMenu.1",
        "serial": "1",
        "package": "flutter",
        "library": "cupertino",
        "element": "CupertinoContextMenu",
        "file": "cupertino.CupertinoContextMenu.1.dart",
        "description": "This sample shows a very simple CupertinoContextMenu for an empty red\n100x100 Container. Simply long press on it to open."
      },
      {
        "sourcePath": "lib/src/material/floating_action_button.dart",
        "sourceLine": 122,
        "id": "material.FloatingActionButton.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "FloatingActionButton",
        "file": "material.FloatingActionButton.1.dart",
        "description": "This example shows how to display a [FloatingActionButton] in a\n[Scaffold], with a pink [backgroundColor] and a thumbs up [Icon].\n\n![](https://flutter.github.io/assets-for-api-docs/assets/material/floating_action_button.png)"
      },
      {
        "sourcePath": "lib/src/material/chip.dart",
        "sourceLine": 239,
        "id": "chip.DeletableChipAttributes.onDeleted.1",
        "serial": "1",
        "package": "flutter",
        "library": "chip",
        "element": "DeletableChipAttributes.onDeleted",
        "file": "chip.DeletableChipAttributes.onDeleted.1.dart",
        "description": "This sample shows how to use [onDeleted] to remove an entry when the\ndelete button is tapped."
      },
      {
        "sourcePath": "lib/src/material/icon_button.dart",
        "sourceLine": 125,
        "id": "material.IconButton.2",
        "serial": "2",
        "package": "flutter",
        "library": "material",
        "element": "IconButton",
        "file": "material.IconButton.2.dart",
        "description": "In this sample the icon button's background color is defined with an [Ink]\nwidget whose child is an [IconButton]. The icon button's filled background\nis a light shade of blue, it's a filled circle, and it's as big as the\nbutton is.\n\n![](https://flutter.github.io/assets-for-api-docs/assets/material/icon_button_background.png)"
      },
      {
        "sourcePath": "lib/src/material/switch_list_tile.dart",
        "sourceLine": 245,
        "id": "material.SwitchListTile.3",
        "serial": "3",
        "package": "flutter",
        "library": "material",
        "element": "SwitchListTile",
        "file": "material.SwitchListTile.3.dart",
        "description": "![Custom switch list tile sample](https://flutter.github.io/assets-for-api-docs/assets/material/switch_list_tile_custom.png)\n\nHere is an example of a custom LabeledSwitch widget, but you can easily\nmake your own configurable widget."
      },
      {
        "sourcePath": "lib/src/material/card.dart",
        "sourceLine": 96,
        "id": "material.Card.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "Card",
        "file": "material.Card.1.dart",
        "description": "This sample shows creation of a [Card] widget that shows album information\nand two actions."
      },
      {
        "sourcePath": "lib/src/material/radio.dart",
        "sourceLine": 92,
        "id": "material.Radio.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "Radio",
        "file": "material.Radio.1.dart",
        "description": "Here is an example of Radio widgets wrapped in ListTiles, which is similar\nto what you could get with the RadioListTile widget.\n\nThe currently selected character is passed into `groupValue`, which is\nmaintained by the example's `State`. In this case, the first `Radio`\nwill start off selected because `_character` is initialized to\n`SingingCharacter.lafayette`.\n\nIf the second radio button is pressed, the example's state is updated\nwith `setState`, updating `_character` to `SingingCharacter.jefferson`.\nThis causes the buttons to rebuild with the updated `groupValue`, and\ntherefore the selection of the second button.\n\nRequires one of its ancestors to be a [Material] widget."
      },
      {
        "sourcePath": "lib/src/material/radio_list_tile.dart",
        "sourceLine": 293,
        "id": "material.RadioListTile.3",
        "serial": "3",
        "package": "flutter",
        "library": "material",
        "element": "RadioListTile",
        "file": "material.RadioListTile.3.dart",
        "description": "![Custom radio list tile sample](https://flutter.github.io/assets-for-api-docs/assets/material/radio_list_tile_custom.png)\n\nHere is an example of a custom LabeledRadio widget, but you can easily\nmake your own configurable widget."
      },
      {
        "sourcePath": "lib/src/material/ink_well.dart",
        "sourceLine": 891,
        "id": "material.InkWell.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "InkWell",
        "file": "material.InkWell.1.dart",
        "description": "Tap the container to cause it to grow. Then, tap it again and hold before\nthe widget reaches its maximum size to observe the clipped ink splash."
      },
      {
        "sourcePath": "lib/src/widgets/sliver.dart",
        "sourceLine": 1680,
        "id": "widgets.SliverFillRemaining.2",
        "serial": "2",
        "package": "flutter",
        "library": "widgets",
        "element": "SliverFillRemaining",
        "file": "widgets.SliverFillRemaining.2.dart",
        "description": "In this sample the [SliverFillRemaining] defers to the size of its [child]\nbecause the child's extent exceeds that of the remaining extent of the\nviewport's main axis."
      },
      {
        "sourcePath": "lib/src/material/checkbox_list_tile.dart",
        "sourceLine": 240,
        "id": "material.CheckboxListTile.2",
        "serial": "2",
        "package": "flutter",
        "library": "material",
        "element": "CheckboxListTile",
        "file": "material.CheckboxListTile.2.dart",
        "description": "![Checkbox list tile semantics sample](https://flutter.github.io/assets-for-api-docs/assets/material/checkbox_list_tile_semantics.png)\n\nHere is an example of a custom labeled checkbox widget, called\nLinkedLabelCheckbox, that includes an interactive [RichText] widget that\nhandles tap gestures."
      },
      {
        "sourcePath": "lib/src/material/expansion_panel.dart",
        "sourceLine": 218,
        "id": "material.ExpansionPanelList.1",
        "serial": "1",
        "package": "flutter",
        "library": "material",
        "element": "ExpansionPanelList",
        "file": "material.ExpansionPanelList.1.dart",
        "description": "Here is a simple example of how to implement ExpansionPanelList."
      },
      {
        "sourcePath": "lib/src/widgets/media_query.dart",
        "sourceLine": 273,
        "id": "widgets.MediaQueryData.systemGestureInsets.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "MediaQueryData.systemGestureInsets",
        "file": "widgets.MediaQueryData.systemGestureInsets.1.dart",
        "description": "For apps that might be deployed on Android Q devices with full gesture\nnavigation enabled, use [MediaQuery.systemGestureInsets] with [Padding]\nto avoid having the left and right edges of the [Slider] from appearing\nwithin the area reserved for system gesture navigation.\n\nBy default, [Slider]s expand to fill the available width. So, we pad the\nleft and right sides."
      },
      {
        "sourcePath": "lib/src/widgets/image.dart",
        "sourceLine": 725,
        "id": "widgets.Image.frameBuilder.1",
        "serial": "1",
        "package": "flutter",
        "library": "widgets",
        "element": "Image.frameBuilder",
        "file": "widgets.Image.frameBuilder.1.dart",
        "description": "The following sample demonstrates how to use this builder to implement an\nimage that fades in once it's been loaded.\n\nThis sample contains a limited subset of the functionality that the\n[FadeInImage] widget provides out of the box."
      }
    ]
    ```

* `flutter create --sample=widgets.Flow.1 --no-pub --offline use_sample_demo1`<a name="create_custom_sample"></a>

    创建一个自定义示例模板到项目，关闭pub更新（有时真的很慢）。 初次创建的文件都是以`(created)`标注

    ```
    zzw:flutter zzw$ flutter create --sample=widgets.Flow.1 --no-pub --offline use_sample_demo1
    Creating project use_sample_demo1... androidx: true
      use_sample_demo1/ios/Runner.xcodeproj/project.xcworkspace/contents.xcworkspacedata (created)
      use_sample_demo1/ios/Runner.xcodeproj/xcshareddata/xcschemes/Runner.xcscheme (created)
      use_sample_demo1/ios/Flutter/Release.xcconfig (created)
      use_sample_demo1/ios/Flutter/Debug.xcconfig (created)
      use_sample_demo1/ios/Flutter/AppFrameworkInfo.plist (created)
      use_sample_demo1/ios/.gitignore (created)
      use_sample_demo1/ios/Runner/Base.lproj/LaunchScreen.storyboard (created)
      use_sample_demo1/ios/Runner/Base.lproj/Main.storyboard (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/Contents.json (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/README.md (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage@3x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-1024x1024@1x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-60x60@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Contents.json (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-76x76@1x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@3x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-83.5x83.5@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@3x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-60x60@3x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@3x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@1x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@1x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-76x76@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@1x.png (created)
      use_sample_demo1/ios/Runner/Info.plist (created)
      use_sample_demo1/ios/Runner.xcworkspace/contents.xcworkspacedata (created)
      use_sample_demo1/test/widget_test.dart (created)
      use_sample_demo1/.gitignore (created)
      use_sample_demo1/.metadata (created)
      use_sample_demo1/android/app/src/profile/AndroidManifest.xml (created)
      use_sample_demo1/android/app/src/main/res/mipmap-mdpi/ic_launcher.png (created)
      use_sample_demo1/android/app/src/main/res/mipmap-hdpi/ic_launcher.png (created)
      use_sample_demo1/android/app/src/main/res/drawable/launch_background.xml (created)
      use_sample_demo1/android/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png (created)
      use_sample_demo1/android/app/src/main/res/mipmap-xxhdpi/ic_launcher.png (created)
      use_sample_demo1/android/app/src/main/res/values/styles.xml (created)
      use_sample_demo1/android/app/src/main/res/mipmap-xhdpi/ic_launcher.png (created)
      use_sample_demo1/android/app/src/main/AndroidManifest.xml (created)
      use_sample_demo1/android/app/src/debug/AndroidManifest.xml (created)
      use_sample_demo1/android/gradle/wrapper/gradle-wrapper.properties (created)
      use_sample_demo1/android/gradle.properties (created)
      use_sample_demo1/android/.gitignore (created)
      use_sample_demo1/android/settings.gradle (created)
      use_sample_demo1/android/app/build.gradle (created)
      use_sample_demo1/android/app/src/main/kotlin/com/example/use_sample_demo1/MainActivity.kt (created)
      use_sample_demo1/android/use_sample_demo1_android.iml (created)
      use_sample_demo1/android/build.gradle (created)
      use_sample_demo1/use_sample_demo1.iml (created)
      use_sample_demo1/README.md (created)
      use_sample_demo1/pubspec.yaml (created)
      use_sample_demo1/ios/Runner.xcodeproj/project.pbxproj (created)
      use_sample_demo1/ios/Runner/AppDelegate.swift (created)
      use_sample_demo1/ios/Runner/Runner-Bridging-Header.h (created)
      use_sample_demo1/lib/main.dart (created)
      use_sample_demo1/.idea/libraries/Dart_SDK.xml (created)
      use_sample_demo1/.idea/libraries/KotlinJavaRuntime.xml (created)
      use_sample_demo1/.idea/libraries/Flutter_for_Android.xml (created)
      use_sample_demo1/.idea/modules.xml (created)
      use_sample_demo1/.idea/workspace.xml (created)
      use_sample_demo1/.idea/runConfigurations/main_dart.xml (created)
    Wrote 67 files.

    All done!
    [✓] Flutter: is fully installed. (Channel stable, v1.12.13+hotfix.8, on Mac OS X 10.13.6 17G12034, locale zh-Hans-CN)
    [!] Android toolchain - develop for Android devices: is partially installed; more components are available. (Android SDK version 29.0.3)
    [!] Xcode - develop for iOS and macOS: is partially installed; more components are available. (Xcode 10.1)
    [✓] Android Studio: is fully installed. (version 3.6)
    [!] Android Studio: is partially installed; more components are available.
    [✓] IntelliJ IDEA Community Edition: is fully installed. (version 2019.3.3)
    [!] Connected device: is not available.

    Run "flutter doctor" for information about installing additional components.

    In order to run your sample application, type:

      $ cd use_sample_demo1
      $ flutter run

    Your sample application code is in use_sample_demo1/lib/main.dart.

    ```

* `flutter create --sample=widgets.Flow.1 --offline --overwrite use_sample_demo1` <a name="create_custom_sample_overwrite"></a>

    再次重新创建`use_sample_demo1`项目，使用`--overwrite`参数，此时可以看见代码后面是`(overwritten)`的标注

    ```
    zzw:flutter zzw$ flutter create --sample=widgets.Flow.1 --offline --overwrite use_sample_demo1
    Recreating project use_sample_demo1...
      use_sample_demo1/ios/Runner.xcodeproj/project.xcworkspace/contents.xcworkspacedata (overwritten)
      use_sample_demo1/ios/Runner.xcodeproj/xcshareddata/xcschemes/Runner.xcscheme (overwritten)
      use_sample_demo1/ios/Flutter/Release.xcconfig (overwritten)
      use_sample_demo1/ios/Flutter/Debug.xcconfig (overwritten)
      use_sample_demo1/ios/Flutter/AppFrameworkInfo.plist (overwritten)
      use_sample_demo1/ios/.gitignore (overwritten)
      use_sample_demo1/ios/Runner/Base.lproj/LaunchScreen.storyboard (overwritten)
      use_sample_demo1/ios/Runner/Base.lproj/Main.storyboard (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/Contents.json (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/README.md (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage@3x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-1024x1024@1x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-60x60@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Contents.json (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-76x76@1x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@3x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-83.5x83.5@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@3x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-60x60@3x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@3x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@1x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@1x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-76x76@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@1x.png (overwritten)
      use_sample_demo1/ios/Runner/Info.plist (overwritten)
      use_sample_demo1/ios/Runner.xcworkspace/contents.xcworkspacedata (overwritten)
      use_sample_demo1/test/widget_test.dart (created)
      use_sample_demo1/.gitignore (overwritten)
      use_sample_demo1/.metadata (overwritten)
      use_sample_demo1/android/app/src/profile/AndroidManifest.xml (overwritten)
      use_sample_demo1/android/app/src/main/res/mipmap-mdpi/ic_launcher.png (overwritten)
      use_sample_demo1/android/app/src/main/res/mipmap-hdpi/ic_launcher.png (overwritten)
      use_sample_demo1/android/app/src/main/res/drawable/launch_background.xml (overwritten)
      use_sample_demo1/android/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png (overwritten)
      use_sample_demo1/android/app/src/main/res/mipmap-xxhdpi/ic_launcher.png (overwritten)
      use_sample_demo1/android/app/src/main/res/values/styles.xml (overwritten)
      use_sample_demo1/android/app/src/main/res/mipmap-xhdpi/ic_launcher.png (overwritten)
      use_sample_demo1/android/app/src/main/AndroidManifest.xml (overwritten)
      use_sample_demo1/android/app/src/debug/AndroidManifest.xml (overwritten)
      use_sample_demo1/android/gradle/wrapper/gradle-wrapper.properties (overwritten)
      use_sample_demo1/android/gradle.properties (overwritten)
      use_sample_demo1/android/.gitignore (overwritten)
      use_sample_demo1/android/settings.gradle (overwritten)
      use_sample_demo1/android/app/build.gradle (overwritten)
      use_sample_demo1/android/app/src/main/kotlin/com/example/use_sample_demo1/MainActivity.kt (overwritten)
      use_sample_demo1/android/use_sample_demo1_android.iml (overwritten)
      use_sample_demo1/android/build.gradle (overwritten)
      use_sample_demo1/use_sample_demo1.iml (overwritten)
      use_sample_demo1/README.md (overwritten)
      use_sample_demo1/pubspec.yaml (overwritten)
      use_sample_demo1/ios/Runner.xcodeproj/project.pbxproj (overwritten)
      use_sample_demo1/ios/Runner.xcodeproj/xcshareddata/xcschemes/Runner.xcscheme (overwritten)
      use_sample_demo1/ios/Runner/AppDelegate.swift (overwritten)
      use_sample_demo1/ios/Runner/Runner-Bridging-Header.h (overwritten)
      use_sample_demo1/lib/main.dart (overwritten)
      use_sample_demo1/.idea/libraries/Dart_SDK.xml (overwritten)
      use_sample_demo1/.idea/libraries/KotlinJavaRuntime.xml (overwritten)
      use_sample_demo1/.idea/libraries/Flutter_for_Android.xml (overwritten)
      use_sample_demo1/.idea/modules.xml (overwritten)
      use_sample_demo1/.idea/workspace.xml (overwritten)
      use_sample_demo1/.idea/runConfigurations/main_dart.xml (overwritten)
    Running "flutter pub get" in use_sample_demo1...                    1.3s
    Wrote 68 files.

    All done!
    [✓] Flutter: is fully installed. (Channel stable, v1.12.13+hotfix.8, on Mac OS X 10.13.6 17G12034, locale zh-Hans-CN)
    [!] Android toolchain - develop for Android devices: is partially installed; more components are available. (Android SDK version 29.0.3)
    [!] Xcode - develop for iOS and macOS: is partially installed; more components are available. (Xcode 10.1)
    [✓] Android Studio: is fully installed. (version 3.6)
    [!] Android Studio: is partially installed; more components are available.
    [✓] IntelliJ IDEA Community Edition: is fully installed. (version 2019.3.3)
    [!] Connected device: is not available.

    Run "flutter doctor" for information about installing additional components.

    In order to run your sample application, type:

      $ cd use_sample_demo1
      $ flutter run

    Your sample application code is in use_sample_demo1/lib/main.dart.
    ```

    不使用`--overwrite`时会出现如下提示：

    ```
    zzw:flutter zzw$ flutter create --sample=widgets.Flow.1 --offline use_sample_demo1
    Will not overwrite existing project in use_sample_demo1: must specify --overwrite for samples to overwrite.
    ```

* `flutter create [-h | --help]`<a name="create_help"></a>

    显示[帮助文档](#help_doc)

***

### 帮助文档<a name="help_doc"></a>

```
Create a new Flutter project.

If run on a project that already exists, this will repair the project, recreating any files that are missing.

Usage: flutter create <output directory>
-h, --help                     Print this usage information.
    --[no-]pub                 Whether to run "flutter pub get" after the project has been created.
                               (defaults to on)

    --[no-]offline             When "flutter pub get" is run by the create command, this indicates whether to run it in offline mode or not. In offline mode, it will need to have
                               all dependencies already available in the pub cache to succeed.

    --[no-]with-driver-test    Also add a flutter_driver dependency and generate a sample 'flutter drive' test.
-t, --template=<type>          Specify the type of project to create.

          [app]                (default) Generate a Flutter application.
          [module]             Generate a project to add a Flutter module to an existing Android or iOS application.
          [package]            Generate a shareable Flutter project containing modular Dart code.
          [plugin]             Generate a shareable Flutter project containing an API in Dart code with a platform-specific implementation for Android, for iOS code, or for both.

-s, --sample=<id>              Specifies the Flutter code sample to use as the main.dart for an application. Implies --template=app. The value should be the sample ID of the desired
                               sample from the API documentation website (http://docs.flutter.dev). An example can be found at
                               https://master-api.flutter.dev/flutter/widgets/SingleChildScrollView-class.html

    --list-samples=<path>      Specifies a JSON output file for a listing of Flutter code samples that can created with --sample.
    --[no-]overwrite           When performing operations, overwrite existing files.
    --description              The description to use for your new Flutter project. This string ends up in the pubspec.yaml file.
                               (defaults to "A new Flutter project.")

    --org                      The organization responsible for your new Flutter project, in reverse domain name notation. This string is used in Java package names and as prefix in
                               the iOS bundle identifier.
                               (defaults to "com.example")

    --project-name             The project name for this new Flutter project. This must be a valid dart package name.
-i, --ios-language             [objc, swift (default)]
-a, --android-language         [java, kotlin (default)]
    --[no-]androidx            Generate a project using the AndroidX support libraries
                               (defaults to on)

Run "flutter help" to see global options.
```
