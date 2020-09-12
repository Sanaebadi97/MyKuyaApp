package info.sanaebadi.mykuya.di

import android.content.Context
import dagger.Module
import dagger.Provides
import info.sanaebadi.domain.executor.PostExecutionThread
import info.sanaebadi.domain.executor.ThreadExecutor
import info.sanaebadi.executor.JobExecutor
import info.sanaebadi.mykuya.global.MykuyaApplication
import info.sanaebadi.mykuya.util.AppSchedulerProvider
import info.sanaebadi.mykuya.util.ConnectionHelper
import info.sanaebadi.mykuya.util.PreferencesHelper
import info.sanaebadi.mykuya.util.SchedulerProvider
import info.sanaebadi.placeapp.executors.UIThread
import javax.inject.Singleton

@Module
class ApplicationModule {

    //TODO:DEFINE REPOSITORY AND CACHE HERE

    @Provides
    internal fun provideContext(application: MykuyaApplication): Context {
        return application.applicationContext
    }


    @Provides
    @Singleton
    internal fun providesThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor {
        return jobExecutor
    }

    @Provides
    @Singleton
    internal fun providesPostExecutionThread(uiThread: UIThread): PostExecutionThread {
        return uiThread
    }


    @Provides
    @Singleton
    fun provideConnectionHelper(context: Context) = ConnectionHelper(context)

    @Provides
    @Singleton
    fun providePreferencesHelper(context: Context) = PreferencesHelper(context)



    @Provides
    @Singleton
    fun provideSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()

}