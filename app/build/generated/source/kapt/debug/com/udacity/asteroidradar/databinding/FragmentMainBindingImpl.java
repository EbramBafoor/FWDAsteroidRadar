package com.udacity.asteroidradar.databinding;
import com.udacity.asteroidradar.R;
import com.udacity.asteroidradar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBindingImpl extends FragmentMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_main_image_of_the_day_layout, 4);
        sViewsWithIds.put(R.id.activity_main_image_of_the_day, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[5]
            , (android.widget.FrameLayout) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.ProgressBar) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.asteroidRecycler.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.statusLoadingWheel.setTag(null);
        this.textView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainviewModel == variableId) {
            setMainviewModel((com.udacity.asteroidradar.presentation.asteroids_list.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainviewModel(@Nullable com.udacity.asteroidradar.presentation.asteroids_list.MainViewModel MainviewModel) {
        this.mMainviewModel = MainviewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.mainviewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMainviewModelLoadingState((androidx.lifecycle.LiveData) object, fieldId);
            case 1 :
                return onChangeMainviewModelAsteroidList((androidx.lifecycle.MediatorLiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>>) object, fieldId);
            case 2 :
                return onChangeMainviewModelPicture((androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.util.Resource<com.udacity.asteroidradar.data.api.dtos.PictureOfDay>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainviewModelLoadingState(androidx.lifecycle.LiveData MainviewModelLoadingState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainviewModelAsteroidList(androidx.lifecycle.MediatorLiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> MainviewModelAsteroidList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainviewModelPicture(androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.util.Resource<com.udacity.asteroidradar.data.api.dtos.PictureOfDay>> MainviewModelPicture, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<com.udacity.asteroidradar.util.LoadingState<?>> mainviewModelLoadingState = null;
        com.udacity.asteroidradar.data.api.dtos.PictureOfDay mainviewModelPictureData = null;
        androidx.lifecycle.MediatorLiveData<java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity>> mainviewModelAsteroidList = null;
        com.udacity.asteroidradar.presentation.asteroids_list.MainViewModel mainviewModel = mMainviewModel;
        java.lang.String mainviewModelPictureDataTitle = null;
        com.udacity.asteroidradar.util.Resource<com.udacity.asteroidradar.data.api.dtos.PictureOfDay> mainviewModelPictureGetValue = null;
        com.udacity.asteroidradar.util.LoadingState<?> mainviewModelLoadingStateGetValue = null;
        androidx.lifecycle.MutableLiveData<com.udacity.asteroidradar.util.Resource<com.udacity.asteroidradar.data.api.dtos.PictureOfDay>> mainviewModelPicture = null;
        java.util.List<com.udacity.asteroidradar.data.room.AsteroidEntity> mainviewModelAsteroidListGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (mainviewModel != null) {
                        // read mainviewModel.loadingState
                        mainviewModelLoadingState = mainviewModel.getLoadingState();
                    }
                    updateLiveDataRegistration(0, mainviewModelLoadingState);


                    if (mainviewModelLoadingState != null) {
                        // read mainviewModel.loadingState.getValue()
                        mainviewModelLoadingStateGetValue = mainviewModelLoadingState.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (mainviewModel != null) {
                        // read mainviewModel.asteroidList
                        mainviewModelAsteroidList = mainviewModel.getAsteroidList();
                    }
                    updateLiveDataRegistration(1, mainviewModelAsteroidList);


                    if (mainviewModelAsteroidList != null) {
                        // read mainviewModel.asteroidList.getValue()
                        mainviewModelAsteroidListGetValue = mainviewModelAsteroidList.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (mainviewModel != null) {
                        // read mainviewModel.picture
                        mainviewModelPicture = mainviewModel.getPicture();
                    }
                    updateLiveDataRegistration(2, mainviewModelPicture);


                    if (mainviewModelPicture != null) {
                        // read mainviewModel.picture.getValue()
                        mainviewModelPictureGetValue = mainviewModelPicture.getValue();
                    }


                    if (mainviewModelPictureGetValue != null) {
                        // read mainviewModel.picture.getValue().data
                        mainviewModelPictureData = mainviewModelPictureGetValue.getData();
                    }


                    if (mainviewModelPictureData != null) {
                        // read mainviewModel.picture.getValue().data.title
                        mainviewModelPictureDataTitle = mainviewModelPictureData.getTitle();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.udacity.asteroidradar.util.BindingAdaptersKt.bindRecyclerView(this.asteroidRecycler, mainviewModelAsteroidList);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.udacity.asteroidradar.util.BindingAdaptersKt.bindLoadingState(this.statusLoadingWheel, mainviewModelLoadingStateGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, mainviewModelPictureDataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainviewModel.loadingState
        flag 1 (0x2L): mainviewModel.asteroidList
        flag 2 (0x3L): mainviewModel.picture
        flag 3 (0x4L): mainviewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}