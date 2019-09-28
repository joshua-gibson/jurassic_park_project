package com.codeclan.jurassicpark.back_end.enums;

public enum EOmnivore {

    KHAAN("Omnivore", 1.8, "Khaan was an oviraptor with a parrot-like beak, discovered in Mongolia.", "http://images.dinosaurpictures.org/Khaan_mckennai_by_T_PEKC_8db7.jpg"),
    VOLCANODON("Omnivore", 6.5, "Vulcanodon was a primitive sauropod that lived in southern Africa.", "http://images.dinosaurpictures.org/Vulcanodon_c603.jpg"),
    XENOCERATOPS("Omnivore", 6.0, "Xenoceratops had horns and a bony frill with elborate ornamentation of projections, knobs, and spikes.", "http://images.dinosaurpictures.org/o-XENOCERATOPS-HORNED-DINOSAUR-570_c5a2.jpg"),
    ZEPHYROSAURUS("Omnivore", 1.8, "An ornithopod dinosaur known only by a partial skull and postcranial fragments, not much about Zephyrosaurus has been discovered.", "http://images.dinosaurpictures.org/jumping-zephyrosaurus_9102.jpg"),
    ;

    private final String type;
    private final double length;
    private final String info;
    private final String url;

    EOmnivore(String type, double length, String info, String url) {
        this.type = type;
        this.length = length;
        this.info = info;
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public String getInfo() {
        return info;
    }

    public String getUrl() {
        return url;
    }

}
