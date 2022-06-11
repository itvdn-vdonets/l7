package models;

public enum PizzaSizeEnum {
    SMALL("small", 30),
    MIDDLE("middle", 40),
    LARGE("large",50);

    private final String sizeName;
    private final int size;

    PizzaSizeEnum(String sizeName, int size) {
        this.sizeName = sizeName;
        this.size = size;
    }

    public String getSizeName() {
        return sizeName;
    }

    public int getSize() {
        return size;
    }
    //60+ - PizzaSizeNotFoundException
    //50-60 -> LARGE
    //40-50 -> MIDDLE
    //30-40 -> SMALL
    public static PizzaSizeEnum getPizzaSizeNameBySize(int size) throws PizzaSizeNotFoundException {
        for (int i = 0; i < PizzaSizeEnum.values().length; i++) {
            if ((i == PizzaSizeEnum.values().length-1) && (size <= PizzaSizeEnum.values()[i].size)) {
                return  PizzaSizeEnum.values()[i];
            }
            //тут мы падаем на предпоследней итерации, ибо код ниже имеет выход за край массива PizzaSizeEnum.values()[i+1]
            if ((size >= PizzaSizeEnum.values()[i].size) && (size < PizzaSizeEnum.values()[i+1].size)) {
                return PizzaSizeEnum.values()[i];
             }
        }
        throw new PizzaSizeNotFoundException("Pizza size not found");
    }
}
