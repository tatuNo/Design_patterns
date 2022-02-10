
public class ProxyImage implements Image {
	private final String filename;
	private RealImage image;
	private final String imagetitle;

	/**
	 * Constructor
	 * @param filename
	 */
	public ProxyImage(String filename, String imagetitle) {
		this.filename = filename;
		this.imagetitle = imagetitle;
	}

	/**
	 * Displays the image
	 */
	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename, imagetitle);
		}
		image.displayImage();
	}

	public String showData() {		
		return image == null ? imagetitle : image.showData();
	}
}


