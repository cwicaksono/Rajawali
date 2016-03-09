package org.rajawali3d.wear;

import android.content.Context;
import org.rajawali3d.materials.MaterialManager;
import org.rajawali3d.materials.textures.TextureManager;
import org.rajawali3d.renderer.Renderer;
import org.rajawali3d.util.Capabilities;

/**
 * @author Ian Thomas (toxicbakery@gmail.com)
 * @author Jared Woolston (jwoolston@tenkiv.com)
 */
public abstract class WatchRenderer extends Renderer {

    public WatchRenderer(Context context) {
        super(context);
    }

    void create() {
        Capabilities.getInstance();

        mGLES_Major_Version = 2;
        mGLES_Minor_Version = 1;
        supportsUIntBuffers = false;

        mTextureManager = TextureManager.getInstance();
        mTextureManager.setContext(getContext());
        mTextureManager.registerRenderer(this);

        mMaterialManager = MaterialManager.getInstance();
        mMaterialManager.setContext(getContext());
        mMaterialManager.registerRenderer(this);
    }
}
