
class RealImage implements Image {
    private final String filename;
    private final String imagetitle;
    
    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename, String imagetitle) {
        this.filename = filename;
        this.imagetitle = imagetitle;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

	public String showData() {
		return filename + " " + imagetitle;
	}
}
