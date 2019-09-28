package com.codeclan.jurassicpark.back_end.enums;

public enum ECarnivore {

    ELASMOSAURUS("Carnivore", 14.0, "Elasmosaurus was an aquatic dinosaur with an extremely long neck that likely fed on other smaller aquatic fauna like fish, molluscs, and squid. E.D. Cope mistakenly placed the skull of an Elasmosaurus on the much shorter tail rather than the extremely long neck.", "http://images.dinosaurpictures.org/fantasy-elasmosaurus_0a70.jpg"),
    INDOSUCHUS("Carnivore", 7.0, "Indosuchus had a flattened crest on its skull.", "http://images.dinosaurpictures.org/Indosuchus_7076.jpg"),
    SPINOSARUS("Carnivore", 18.0, "Spinosaurus was one of the largest carnivorous dinosaurs to walk the Earth. Its diet consisted mostly of fish and the large spines on its back likely formed a sail.", "http://images.dinosaurpictures.org/spinosaurus_1_118f.jpg"),
    TYRANNOSAURUS("Carnivore", 12.0, "Tyrannosaurus is well-represented in both fiction and history with over 50 specimens discovered. It and was one of the last non-avian dinosaurs to exist before the extinction event. Tyrannosaurus had a massive skull and a long heavy tail.", "http://images.dinosaurpictures.org/dinosaurs-tyrannosaurus_00336745_13a8.jpg"),
    UTAHRAPTOR("Carnivore", 6.0, "Found in the USA, Utahraptor resembled velociraptor but much larger, prompting Robert T. Bakker to pronounce it 'Spielberg's raptor' due to the velociraptors in the movie <em>Jurassic Park</em> being portrayed much larger than their historical counterparts.", "http://images.dinosaurpictures.org/Utahraptor-M.Shiraishi_c5cc.jpg"),
    COMPSOGNATHUS("Carnivore", 0.65, "Compsognathus was small and bipedal, roughly the size of a turkey. It lived in Europe and was the first dinosaur genus to be portrayed with feathers.", " http://images.dinosaurpictures.org/Compsognathus_ab58.jpg"),
    ALLOSAURUS("Carnivore", 12.0, "Allosaurus was an apex predator in the Late Jurassic in North America.", "http://images.dinosaurpictures.org/Allosaurus0003_091b.jpg" ),
    ;

    private final String type;
    private final double length;
    private final String info;
    private final String url;

    ECarnivore(String type, double length, String info, String url) {
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
