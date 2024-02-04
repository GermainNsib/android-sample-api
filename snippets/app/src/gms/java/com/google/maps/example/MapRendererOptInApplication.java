// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.maps.example;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;
// [START maps_android_renderer_opt_in]
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.MapsInitializer.Renderer;
import com.google.android.gms.maps.OnMapsSdkInitializedCallback;

class MapRendererOptInApplication extends Application implements OnMapsSdkInitializedCallback {

  @Override
  public void onCreate() {
    super.onCreate();
    MapsInitializer.initialize(getApplicationContext(), Renderer.LATEST, this);
  }

  @Override
  public void onMapsSdkInitialized(MapsInitializer.Renderer renderer) {
    switch (renderer) {
      case LATEST:
        Log.d("MapsDemo", "The latest version of the renderer is used.");
        break;
      case LEGACY:
        Log.d("MapsDemo", "The legacy version of the renderer is used.");
        break;
    }
  }
}
// [END maps_android_renderer_opt_in]
