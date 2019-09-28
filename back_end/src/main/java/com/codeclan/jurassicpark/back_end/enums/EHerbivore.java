package com.codeclan.jurassicpark.back_end.enums;

public enum EHerbivore {



    APATOSAURUS("Herbivore", 21.0, "Named the 'deceptive lizard' because its skull was confused with those of other sauropods until 1909.", "http://images.dinosaurpictures.org/apatosaurus_33e1.jpg"),
    BRACHIOSAURUS("Herbivore", 30.0, "Brachiosaurus was a large, North American sauropod dinosaur with an arch encircling its nasal opening.", "ttp://images.dinosaurpictures.org/papo_brachiosaurus_2012_cf3f.jpg"),
    DRACOREX("Herbivore", 4.0, "Dracorex hogwartsia was a pachycephalosaur that did not have a domed head. Instead, its skull was adorned with spikes and frills reminiscent of a dragon. A skull was discovered in the Hell Creek Formation in South Dakota and donated to the Children's Museum of Indianapolis in 2004. Its name was inspired by J.K. Rowling's Harry Potter series and the young visitors to the children's museum.", " http://images.dinosaurpictures.org/Dracorex_f6c1.jpg"),
    GIRAFFATITAN("Herbivore", 23.0, "Giraffatitan was a large sauropod related to Brachiosaurus with huge nostrils and nasal openings in its skull.", "http://images.dinosaurpictures.org/Giraffatitan_DB_be12.jpg"),
    JINGSHANOSAURUS("Herbivore", 5.0, "Jingshanosaurus was one of the last prosauropods, a long-necked herbivore able to walk on two legs.", "http://images.dinosaurpictures.org/Jingshanosaurus_a37b.jpg"),
    MINMI("Herbivore", 3.0, "Minmi was a small, anklyosaurian, armored dinosaur discovered in Australia.", "http://images.dinosaurpictures.org/minmi-paravertebra-a-prehistoric-era-sergey-krasovskiy_07e1.jpg"),
    OURANOSAURUS("Herbivore", 7.0, "Ouranosaurus was an iguanodont dinosaur in Africa. It had a large sail on its back supported by long, wide neural spines and an elnogated, flat skull.", "http://images.dinosaurpictures.org/dino_ouranosaurus_ac8c.jpg"),
    PERASAUROLOPHUS("Herbivore", 11.0, "Found in Canada and the USA, Parasaurolophus was a hadrosaur most famous for its long, elaborate cranial crest.", "http://images.dinosaurpictures.org/parasaurolophus_by_thek560-d7d7a3r_eab8.jpg"),
    ;

    private final String type;
    private final double length;
    private final String info;
    private final String url;

    EHerbivore(String type, double length, String info, String url) {
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
