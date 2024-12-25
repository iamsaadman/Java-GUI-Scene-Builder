package MID_Summer_2020;

class DiscountedItem extends Item {
    double discount;

    DiscountedItem(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        // Calculate and return the discounted price
        double discountedPrice = price - (price * discount / 100);
        return discountedPrice;
    }
}
