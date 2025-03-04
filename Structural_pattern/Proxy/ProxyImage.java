package Structural_pattern.Proxy;

/**
 * Класс, представляющий заместителя, который контролирует доступ к реальному объекту.
 */
class ProxyImage implements Image {
    private RealImage realImage;
    private final String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
