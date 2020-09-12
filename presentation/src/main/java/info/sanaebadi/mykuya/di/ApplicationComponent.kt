package info.sanaebadi.mykuya.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import info.sanaebadi.mykuya.global.MykuyaApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ApplicationModule::class, BuildersModule::class, ViewModelModule::class])

interface ApplicationComponent : AndroidInjector<MykuyaApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MykuyaApplication): Builder

        fun build(): ApplicationComponent
    }
}