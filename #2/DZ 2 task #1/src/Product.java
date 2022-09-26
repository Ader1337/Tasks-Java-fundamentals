class Product {
    private static int countOfObjects = 0;
    private double price;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    // Конструктори
    public Product() {
        countOfObjects++;
    }
    public Product(String initName, double initPrice) {
        this();
        this.name = initName;
        this.price = initPrice;
    }

    //Методи 
    public static int count(){
        return countOfObjects;
    } 
}
