package com.lowwor.realtimebus.injector.component;

import com.lowwor.realtimebus.BusApplication;
import com.lowwor.realtimebus.data.rx.RxTrackService;
import com.lowwor.realtimebus.data.service.TrackService;
import com.lowwor.realtimebus.data.api.BusApiRepository;
import com.lowwor.realtimebus.data.local.PreferencesHelper;
import com.lowwor.realtimebus.injector.module.AppModule;
import com.lowwor.realtimebus.injector.module.RepositoryModule;
import com.lowwor.realtimebus.viewmodel.TrackViewModel;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by lowworker on 2015/9/19.
 */

@Singleton
@Component(modules = {AppModule.class, RepositoryModule.class})
public interface AppComponent {

    BusApplication app();
    BusApiRepository busApiRepository();
    PreferencesHelper preferencesHelper();
    RxTrackService rxTrackService();

    TrackViewModel trackViewModel();
    void inject(TrackService trackService);

}
