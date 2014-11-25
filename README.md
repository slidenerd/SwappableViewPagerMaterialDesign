SwappableViewPagerMaterialDesign
================================

This repository contains a ViewPager with Fragments which can be swapped within a tab on button click. 

Our sample demo has a MainActivity with a Fragment inside it occupying full space called TabbedFragment. This TabbedFragment supports 3 tabs where each tab has 3 fragments in it. TAB1=A1,A2,A3..and so on. All Fragments A1..C3 use a FrameLayout with a common ID which can be replaced. Each Fragment supports a button when when clicked starts a FragmentTransaction to replace it with the next Fragment. The Activity tracks onBackPressed() and forwards it all the appropriate fragments and awaits their response.
  The demo uses a custom FragmentPagerAdapter which maintains a SparseArray containing all the Fragments and removes , retrieves and adds the Fragments under the appropriate methods of the Adapter. The BackPressedListener is an interface used by a BackPressedImplementation class to handle back press actions in a Fragment.
