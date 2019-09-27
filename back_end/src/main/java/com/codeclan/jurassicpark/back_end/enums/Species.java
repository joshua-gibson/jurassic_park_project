package com.codeclan.jurassicpark.back_end.enums;

public enum Species {

    ALLOSAURUS("Carnivore", 12.0, "Allosaurus was an apex predator in the Late Jurassic in North America.", "http://images.dinosaurpictures.org/Allosaurus0003_091b.jpg" ),
    APATOSAURUS("Herbivore", 21.0, "Named the 'deceptive lizard' because its skull was confused with those of other sauropods until 1909.", "http://images.dinosaurpictures.org/apatosaurus_33e1.jpg"),
    BRACHIOSAURUS("Herbivore", 30.0, "Brachiosaurus was a large, North American sauropod dinosaur with an arch encircling its nasal opening.", "ttp://images.dinosaurpictures.org/papo_brachiosaurus_2012_cf3f.jpg"),
    COMPSOGNATHUS("Carnivore", 0.65, "Compsognathus was small and bipedal, roughly the size of a turkey. It lived in Europe and was the first dinosaur genus to be portrayed with feathers.", " http://images.dinosaurpictures.org/Compsognathus_ab58.jpg"),
    DRACOREX("Herbivore", 4.0, "Dracorex hogwartsia was a pachycephalosaur that did not have a domed head. Instead, its skull was adorned with spikes and frills reminiscent of a dragon. A skull was discovered in the Hell Creek Formation in South Dakota and donated to the Children's Museum of Indianapolis in 2004. Its name was inspired by J.K. Rowling's Harry Potter series and the young visitors to the children's museum.", " http://images.dinosaurpictures.org/Dracorex_f6c1.jpg"),
    ELASMOSAURUS("Carnivore", 14.0, "Elasmosaurus was an aquatic dinosaur with an extremely long neck that likely fed on other smaller aquatic fauna like fish, molluscs, and squid. E.D. Cope mistakenly placed the skull of an Elasmosaurus on the much shorter tail rather than the extremely long neck.", "http://images.dinosaurpictures.org/fantasy-elasmosaurus_0a70.jpg"),
    GIRAFFATITAN("Herbivore", 23.0, "Giraffatitan was a large sauropod related to Brachiosaurus with huge nostrils and nasal openings in its skull.", "http://images.dinosaurpictures.org/Giraffatitan_DB_be12.jpg"),
    INDOSUCHUS("Carnivore", 7.0, "Indosuchus had a flattened crest on its skull.", "http://images.dinosaurpictures.org/Indosuchus_7076.jpg"),
    JINGSHANOSAURUS("Herbivore", 5.0, "Jingshanosaurus was one of the last prosauropods, a long-necked herbivore able to walk on two legs.", "http://images.dinosaurpictures.org/Jingshanosaurus_a37b.jpg"),
    KHAAN("Omnivore", 1.8, "Khaan was an oviraptor with a parrot-like beak, discovered in Mongolia.", "http://images.dinosaurpictures.org/Khaan_mckennai_by_T_PEKC_8db7.jpg"),
    MINMI("Herbivore", 3.0, "Minmi was a small, anklyosaurian, armored dinosaur discovered in Australia.", "http://images.dinosaurpictures.org/minmi-paravertebra-a-prehistoric-era-sergey-krasovskiy_07e1.jpg"),
    OURANOSAURUS("Herbivore", 7.0, "Ouranosaurus was an iguanodont dinosaur in Africa. It had a large sail on its back supported by long, wide neural spines and an elnogated, flat skull.", "http://images.dinosaurpictures.org/dino_ouranosaurus_ac8c.jpg"),
    PERASAUROLOPHUS("Herbivore", 11.0, "Found in Canada and the USA, Parasaurolophus was a hadrosaur most famous for its long, elaborate cranial crest.", "http://images.dinosaurpictures.org/parasaurolophus_by_thek560-d7d7a3r_eab8.jpg"),
    SPINOSARUS("Carnivore", 18.0, "Spinosaurus was one of the largest carnivorous dinosaurs to walk the Earth. Its diet consisted mostly of fish and the large spines on its back likely formed a sail.", "http://images.dinosaurpictures.org/spinosaurus_1_118f.jpg"),
    TYRANNOSAURUS("Carnivore", 12.0, "Tyrannosaurus is well-represented in both fiction and history with over 50 specimens discovered. It and was one of the last non-avian dinosaurs to exist before the extinction event. Tyrannosaurus had a massive skull and a long heavy tail.", "http://images.dinosaurpictures.org/dinosaurs-tyrannosaurus_00336745_13a8.jpg"),
    UTAHRAPTOR("Carnivore", 6.0, "Found in the USA, Utahraptor resembled velociraptor but much larger, prompting Robert T. Bakker to pronounce it 'Spielberg's raptor' due to the velociraptors in the movie <em>Jurassic Park</em> being portrayed much larger than their historical counterparts.", "http://images.dinosaurpictures.org/Utahraptor-M.Shiraishi_c5cc.jpg"),
    VOLCANODON("Herbivore", 6.5, "Vulcanodon was a primitive sauropod that lived in southern Africa.", "http://images.dinosaurpictures.org/Vulcanodon_c603.jpg"),
    XENOCERATOPS("Herbivore", 6.0, "Xenoceratops had horns and a bony frill with elborate ornamentation of projections, knobs, and spikes.", "http://images.dinosaurpictures.org/o-XENOCERATOPS-HORNED-DINOSAUR-570_c5a2.jpg"),
    ZEPHYROSAURUS("Herbivore", 1.8, "An ornithopod dinosaur known only by a partial skull and postcranial fragments, not much about Zephyrosaurus has been discovered.", "http://images.dinosaurpictures.org/jumping-zephyrosaurus_9102.jpg"),
    ;

    private final String type;
    private final double length;
    private final String info;
    private final String url;

    Species(String type, double length, String info, String url) {
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
