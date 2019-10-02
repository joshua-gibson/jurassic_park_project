package com.codeclan.jurassicpark.back_end.components;


import com.codeclan.jurassicpark.back_end.enums.DietType;
import com.codeclan.jurassicpark.back_end.models.*;
import com.codeclan.jurassicpark.back_end.repositories.DinosaurRepository.DinosaurRepository;
import com.codeclan.jurassicpark.back_end.repositories.PaddockRepository.PaddockRepository;
import com.codeclan.jurassicpark.back_end.repositories.ParkRepository.ParkRepository;
import com.codeclan.jurassicpark.back_end.repositories.SpeciesRepository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ParkRepository parkRepository;

    @Autowired
    PaddockRepository paddockRepository;

    @Autowired
    DinosaurRepository dinosaurRepository;

    @Autowired
    SpeciesRepository speciesRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Park jurassicPark = new Park("Jurassic Park", 10);
        parkRepository.save(jurassicPark);

        Paddock paddock1 = new Paddock("Swampy Copse", 50, 2, jurassicPark);
        paddockRepository.save(paddock1);

        Paddock paddock2 = new Paddock("T-Rex Meadow", 20, 1, jurassicPark);
        paddockRepository.save(paddock2);

        Paddock paddock3 = new Paddock("Stony Grassland", 30, 5, jurassicPark);
        paddockRepository.save(paddock3);

        Paddock paddock4 = new Paddock("DUP Party", 30, 10, jurassicPark);
        paddockRepository.save(paddock4);

        Paddock paddock5 = new Paddock("Central view", 40, 5, jurassicPark);
        paddockRepository.save(paddock5);

        Paddock paddock6 = new Paddock("Herb Valley", 50, 7, jurassicPark);
        paddockRepository.save(paddock6);

        Paddock paddock7 = new Paddock("Grassy Knoll", 30, 4, jurassicPark);
        paddockRepository.save(paddock7);

//        Paddock paddock8 = new Paddock("Nublar", 20, 4, jurassicPark);
//        paddockRepository.save(paddock8);



        speciesRepository.save(new Species(
                "Indosuchus",
                DietType.CARNIVORE,
                7.0,
                "Indosuchus had a flattened crest on its skull. Indosuchus is a genus of abelisaurid dinosaur from the Late Cretaceous Period (70 to 66 million years ago – the Maastrichtian), a theropod related to Abelisaurus.",
                "http://images.dinosaurpictures.org/Indosuchus_7076.jpg"));
        speciesRepository.save(new Species(
                "Apatosaurus",
                DietType.HERBIVORE,
                21.0,
                "Named the 'deceptive lizard' because its skull was confused with those of other sauropods until 1909.",
                "http://images.dinosaurpictures.org/apatosaurus_33e1.jpg"));
        speciesRepository.save(new Species(
                "Elasmosaurus",
                DietType.CARNIVORE,
                14.0,
                "Elasmosaurus was an aquatic dinosaur with an extremely long neck that likely fed on other smaller aquatic fauna like fish, molluscs, and squid. E.D. Cope mistakenly placed the skull of an Elasmosaurus on the much shorter tail rather than the extremely long neck.",
                "http://images.dinosaurpictures.org/elasmosaurus_586f.jpg"));
        speciesRepository.save(new Species(
                "Spinosaurus",
                DietType.CARNIVORE,
                18.0,
                "Spinosaurus was one of the largest carnivorous dinosaurs to walk the Earth. Its diet consisted mostly of fish and the large spines on its back likely formed a sail.",
                "http://images.dinosaurpictures.org/Spinosaurus_BW2_0615.jpg"));
        speciesRepository.save(new Species(
                "Tyrannosaurus",
                DietType.CARNIVORE,
                12.0,
                "Tyrannosaurus is well-represented in both fiction and history with over 50 specimens discovered. It and was one of the last non-avian dinosaurs to exist before the extinction event. Tyrannosaurus had a massive skull and a long heavy tail.",
                "http://images.dinosaurpictures.org/tyrannosaurusSP_a2fb.jpg"));
        speciesRepository.save(new Species(
                "Utahraptor",
                DietType.CARNIVORE,
                6.0,
                "Found in the USA, Utahraptor resembled velociraptor but much larger. In 2018, it was proposed that Utahraptor be the Utah state dinosaur, an act that was approved by the Senate.",
                "http://images.dinosaurpictures.org/Utahraptor-M.Shiraishi_c5cc.jpg"));
        speciesRepository.save(new Species(
                "Compsognathus",
                DietType.CARNIVORE,
                0.65,
                "Compsognathus was small and bipedal, roughly the size of a turkey. It lived in Europe and was the first dinosaur genus to be portrayed with feathers.",
                " http://images.dinosaurpictures.org/Compsognathus_ab58.jpg"));
        speciesRepository.save(new Species(
                "Allosaurus",
                DietType.CARNIVORE,
                12.0,
                "Allosaurus was an apex predator in the Late Jurassic in North America.",
                "http://images.dinosaurpictures.org/Allosaurus0003_091b.jpg" ));
         speciesRepository.save(new Species(
                 "Apotasaurus",
                 DietType.HERBIVORE,
                 21.0,
                 "Named the 'deceptive lizard' because its skull was confused with those of other sauropods until 1909.",
                 "http://images.dinosaurpictures.org/apatosaurus_33e1.jpg"));
         speciesRepository.save(new Species(
                 "Brachiosaurus",
                 DietType.HERBIVORE,
                 30.0,
                 "Brachiosaurus was a large, North American sauropod dinosaur with an arch encircling its nasal opening.",
                 "http://images.dinosaurpictures.org/papo_brachiosaurus_2012_cf3f.jpg"));
         speciesRepository.save(new Species(
                 "Dracorex",
                 DietType.HERBIVORE,
                 4.0,
                 "Dracorex hogwartsia was a pachycephalosaur that did not have a domed head. Instead, its skull was adorned with spikes and frills reminiscent of a dragon. A skull was discovered in the Hell Creek Formation in South Dakota and donated to the Children's Museum of Indianapolis in 2004. Its name was inspired by J.K. Rowling's Harry Potter series and the young visitors to the children's museum.",
                 " http://images.dinosaurpictures.org/Dracorex_BW_8b80.jpg"));
         speciesRepository.save(new Species(
                 "Giraffatitan",
                 DietType.HERBIVORE,
                 23.0,
                 "Giraffatitan was a large sauropod related to Brachiosaurus with huge nostrils and nasal openings in its skull.",
                 "http://images.dinosaurpictures.org/Giraffatitan_DB_be12.jpg"));
         speciesRepository.save(new Species(
                 "Jingshanosaurus",
                 DietType.HERBIVORE,
                 5.0,
                 "Jingshanosaurus was one of the last prosauropods, a long-necked herbivore able to walk on two legs.",
                 "http://images.dinosaurpictures.org/Jingshanosaurus_a37b.jpg"));
         speciesRepository.save(new Species(
                 "Minmi",
                 DietType.HERBIVORE,
                 3.0,
                 "Minmi was a small, anklyosaurian, armored dinosaur discovered in Australia.",
                         "http://images.dinosaurpictures.org/minmi-paravertebra-a-prehistoric-era-sergey-krasovskiy_07e1.jpg"));
         speciesRepository.save(new Species(
                 "Ouranosaurus",
                 DietType.HERBIVORE,
                 7.0,
                 "Ouranosaurus was an iguanodont dinosaur in Africa. It had a large sail on its back supported by long, wide neural spines and an elnogated, flat skull.",
                 "http://images.dinosaurpictures.org/dino_ouranosaurus_ac8c.jpg"));
         speciesRepository.save(new Species(
                 "Perasaurolophus",
                 DietType.HERBIVORE,
                 11.0,
                 "Found in Canada and the USA, Parasaurolophus was a hadrosaur most famous for its long, elaborate cranial crest.",
                 "http://images.dinosaurpictures.org/parasaurolophus_by_thek560-d7d7a3r_eab8.jpg"));
         speciesRepository.save(new Species(
                 "Khaan",
                 DietType.OMNIVORE,
                 1.8,
                 "Khaan was an oviraptor with a parrot-like beak, discovered in Mongolia.",
                 "http://images.dinosaurpictures.org/Khaan_mckennai_by_T_PEKC_8db7.jpg"));
         speciesRepository.save(new Species(
                 "Volcanodon",
                 DietType.HERBIVORE,
                 6.5,
                 "Vulcanodon was a primitive sauropod that lived in southern Africa.",
                 "http://images.dinosaurpictures.org/Vulcanodon_c603.jpg"));
         speciesRepository.save(new Species(
                 "Xenoceratops",
                 DietType.HERBIVORE,
                 6.0,
                 "Xenoceratops had horns and a bony frill with elborate ornamentation of projections, knobs, and spikes.",
                 "http://images.dinosaurpictures.org/o-XENOCERATOPS-HORNED-DINOSAUR-570_c5a2.jpg"));
         speciesRepository.save(new Species(
                 "Zephyrosaurus",
                 DietType.HERBIVORE,
                 1.8,
                 "An ornithopod dinosaur known only by a partial skull and postcranial fragments, not much about Zephyrosaurus has been discovered.",
                 "http://images.dinosaurpictures.org/jumping-zephyrosaurus_9102.jpg"));



        Dinosaur carn1 = new Dinosaur("Carl", paddock1, speciesRepository.findSpeciesByType("Indosuchus"));
        dinosaurRepository.save(carn1);

        Dinosaur herb1 = new Dinosaur("Harry", paddock1, speciesRepository.findSpeciesByType("Utahraptor"));
        dinosaurRepository.save(herb1);

        Dinosaur omni1 = new Dinosaur("Olly", paddock1, speciesRepository.findSpeciesByType("Khaan"));
        dinosaurRepository.save(omni1);

        Dinosaur carn2 = new Dinosaur("Daisy", paddock1, speciesRepository.findSpeciesByType("Compsognathus"));
        dinosaurRepository.save(carn2);


        Dinosaur carn3 = new Dinosaur("Luke", paddock2, speciesRepository.findSpeciesByType("Khaan"));
        dinosaurRepository.save(carn3);
        Dinosaur carn4 = new Dinosaur("Leia", paddock2, speciesRepository.findSpeciesByType("Khaan"));
        dinosaurRepository.save(carn4);
        Dinosaur carn5 = new Dinosaur("Obi-Wan", paddock2, speciesRepository.findSpeciesByType("Compsognathus"));
        dinosaurRepository.save(carn5);
        Dinosaur carn6 = new Dinosaur("Jar-Jar", paddock2, speciesRepository.findSpeciesByType("Allosaurus"));
        dinosaurRepository.save(carn6);

        Dinosaur herb2 = new Dinosaur("Mal", paddock3, speciesRepository.findSpeciesByType("Xenoceratops"));
        dinosaurRepository.save(herb2);
        Dinosaur herb3 = new Dinosaur("Jayne", paddock3, speciesRepository.findSpeciesByType("Perasaurolophus"));
        dinosaurRepository.save(herb3);
        Dinosaur herb4 = new Dinosaur("River", paddock3, speciesRepository.findSpeciesByType("Jingshanosaurus"));
        dinosaurRepository.save(herb4);

        Dinosaur herb5 = new Dinosaur("Inara", paddock4, speciesRepository.findSpeciesByType("Perasaurolophus"));
        dinosaurRepository.save(herb5);
        Dinosaur herb6 = new Dinosaur("Kaylee", paddock4, speciesRepository.findSpeciesByType("Minmi"));
        dinosaurRepository.save(herb6);
        Dinosaur herb7 = new Dinosaur("Wash", paddock4, speciesRepository.findSpeciesByType("Apotasaurus"));
        dinosaurRepository.save(herb7);


        Dinosaur herb8 = new Dinosaur("Victor", paddock5, speciesRepository.findSpeciesByType("Jingshanosaurus"));
        dinosaurRepository.save(herb8);
        Dinosaur herb9 = new Dinosaur("Pam", paddock5, speciesRepository.findSpeciesByType("Perasaurolophus"));
        dinosaurRepository.save(herb9);

        Dinosaur herb10 = new Dinosaur("Andy", paddock6, speciesRepository.findSpeciesByType("Minmi"));
        dinosaurRepository.save(herb10);

        Dinosaur carn7 = new Dinosaur("Slate", paddock7, speciesRepository.findSpeciesByType("Compsognathus"));
        dinosaurRepository.save(carn7);
        Dinosaur carn8 = new Dinosaur("Henry", paddock7, speciesRepository.findSpeciesByType("Utahraptor"));
        dinosaurRepository.save(carn8);

//        Dinosaur carn9 = new Dinosaur("Angus", paddock8, speciesRepository.findSpeciesByType("Tyrannosaurus"));
//        dinosaurRepository.save(carn9);
//        Dinosaur carn10 = new Dinosaur("Jolie", paddock8, speciesRepository.findSpeciesByType("Tyrannosaurus"));
//        dinosaurRepository.save(carn10);

    }
}