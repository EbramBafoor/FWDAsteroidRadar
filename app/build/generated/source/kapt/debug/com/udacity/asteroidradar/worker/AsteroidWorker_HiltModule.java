package com.udacity.asteroidradar.worker;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(SingletonComponent.class)
@OriginatingElement(
    topLevelClass = AsteroidWorker.class
)
public interface AsteroidWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.udacity.asteroidradar.worker.AsteroidWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(AsteroidWorker_AssistedFactory factory);
}
