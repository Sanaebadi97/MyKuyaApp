package info.sanaebadi.mykuya.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import info.sanaebadi.mykuya.mvvm.feature.view.MainActivity
import info.sanaebadi.mykuya.mvvm.feature.view.fragment.HomeFragment

@Module
abstract class BuildersModule {

    //TODO:DEFINE FRAGMENTS HERE

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class])
    internal abstract fun bindProductsHomeFragment(): HomeFragment


}