import java.awt.image.BufferedImage;

public class SimpleTexture extends bpu {

	private boolean textureUploaded;
	private BufferedImage bufferedImage;

	public SimpleTexture() {
		super(null);
	}

	void checkTextureUploaded() {
		if (!this.textureUploaded) {
			if (this.bufferedImage != null) {
				bqi.a(super.b(), this.bufferedImage);
				this.textureUploaded = true;
			}
		}
	}

	public void setBufferedImage(BufferedImage bufferedImage) {
		this.textureUploaded = false;
		this.bufferedImage = bufferedImage;
	}

	@Override
	public int b() {
		checkTextureUploaded();
		return super.b();
	}

	@Override
	public void a(bqy resourceManager) {
	}
}