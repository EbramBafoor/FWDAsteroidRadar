package com.udacity.asteroidradar.databinding;
import com.udacity.asteroidradar.R;
import com.udacity.asteroidradar.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutAsteroidListItemBindingImpl extends LayoutAsteroidListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutAsteroidListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LayoutAsteroidListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.layoutAsteroidItemClContainer.setTag(null);
        this.layoutAsteroidItemImgPotentiallyHazardous.setTag(null);
        this.layoutAsteroidItemTvCloseApproachDate.setTag(null);
        this.layoutAsteroidItemTvCodename.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.asteroid == variableId) {
            setAsteroid((com.udacity.asteroidradar.data.room.AsteroidEntity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAsteroid(@Nullable com.udacity.asteroidradar.data.room.AsteroidEntity Asteroid) {
        this.mAsteroid = Asteroid;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.asteroid);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.udacity.asteroidradar.data.room.AsteroidEntity asteroid = mAsteroid;
        boolean asteroidPotentiallyHazardous = false;
        java.lang.String asteroidCloseApproachDate = null;
        java.lang.String asteroidCodename = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (asteroid != null) {
                    // read asteroid.potentiallyHazardous
                    asteroidPotentiallyHazardous = asteroid.isPotentiallyHazardous();
                    // read asteroid.closeApproachDate
                    asteroidCloseApproachDate = asteroid.getCloseApproachDate();
                    // read asteroid.codename
                    asteroidCodename = asteroid.getCodename();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.udacity.asteroidradar.util.BindingAdaptersKt.bindContentDescription(this.layoutAsteroidItemImgPotentiallyHazardous, asteroidPotentiallyHazardous);
            com.udacity.asteroidradar.util.BindingAdaptersKt.bindAsteroidStatusImage(this.layoutAsteroidItemImgPotentiallyHazardous, asteroidPotentiallyHazardous);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.layoutAsteroidItemTvCloseApproachDate, asteroidCloseApproachDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.layoutAsteroidItemTvCodename, asteroidCodename);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): asteroid
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}