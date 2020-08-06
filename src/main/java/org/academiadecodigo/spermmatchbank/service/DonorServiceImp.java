package org.academiadecodigo.spermmatchbank.service;

import org.academiadecodigo.spermmatchbank.model.Consumer;
import org.academiadecodigo.spermmatchbank.model.Donor;
import org.academiadecodigo.spermmatchbank.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 05/08/2020.
 */
@Service
public class DonorServiceImp implements DonorService{

    private List<Donor> listDonors = new ArrayList<>();
    private ProductServiceImp productService;
    private Donor d1 = new Donor();
    private Donor d2 = new Donor();
    private Donor d3 = new Donor();
    private Donor d4 = new Donor();
    private Donor d5 = new Donor();
    private Donor d6 = new Donor();
    private Donor d7 = new Donor();
    private Donor d8 = new Donor();
    private Donor d9 = new Donor();
    private Donor d10 = new Donor();

    public DonorServiceImp(){

        d1.setId(1);
        d1.setNacionality("Portuguese");
        d1.setRace("Aethiopian");
        d1.setFirstName("Gonçalo");
        d1.setBloodType("A+");
        d1.setEyeColor("Black");
        d1.setHairColor("Black");
        d1.setImgURL("https://images.generated.photos/Vb69D6wgCa9LQtYeqoAGtcwVRlGwP0-Zd3xY4rUSxeA/rs:fit:512:512/Z3M6Ly9nZW5lcmF0/ZWQtcGhvdG9zL3Yz/XzA3Mjk1NzdfMDQ0/MTMwNl8wMjcxNjgy/LmpwZw.jpg");
        d1.setBi("123123123");
        d1.setLastName("C");
        d1.setAge(27);
        d1.setBio("I am Gonçalo C, 27-year-old government politician who enjoys chess, competitive dog grooming and photography. I am friendly and brave, but can also be very disloyal and a bit stingy. I am Portuguese who defines himself as pansexual. I started studying philosophy, politics and economics at college but I never finished the course.");
        d1.setGender("Male");
        d1.setEmail("gonçalosexy97@m.com");
        d1.setPhone("123123123");
        d1.setAddress("Avenida de Roma");
        d1.setCountry("Portugal");
        d1.setCity("Lisboa");
        d1.setWeight("90");

        d2.setId(2);
        d2.setNacionality("Russian");
        d2.setRace("Gypsy");
        d2.setFirstName("Valdo");
        d2.setBloodType("B+");
        d2.setEyeColor("Brown");
        d2.setHairColor("Blond");
        d2.setImgURL("https://images.generated.photos/CM44eLlabn8CRZVeLYKK0DbB0arwfKWv5U8O-HW3tiA/rs:fit:512:512/Z3M6Ly9nZW5lcmF0/ZWQtcGhvdG9zL3Yy/XzAwNTAxMzguanBn.jpg");
        d2.setBi("123123123");
        d2.setLastName("C");
        d2.setAge(21);
        d2.setBio("I am a Russian Jedi who defines himself as bisexual. I started studying philosophy, politics and economics at college but never finished the course. I have phobia of bridges and heights, and I'm obsessed with bottled milk. ");
        d2.setGender("Male");
        d2.setEmail("yo@m.com");
        d2.setPhone("123123123");
        d2.setAddress("Avenida dos Aliados");
        d2.setCountry("Portugal");
        d2.setCity("Porto");
        d2.setWeight("200");

        d3.setId(3);
        d3.setNacionality("Russian");
        d3.setRace("Caucasian");
        d3.setFirstName("Filipe");
        d3.setBloodType("B+");
        d3.setEyeColor("Black");
        d3.setHairColor("Brown");
        d3.setImgURL("https://generated.photos/face/joyfull-white-adult-male-with-short-brown-hair-and-brown-eyes--5e6806706d3b380006d4dd21");
        d3.setBi("123123123");
        d3.setLastName("S");
        d3.setAge(30);
        d3.setBio("I am Filipe a 30-year-old government politician who enjoys stealing candy from babies, meditation and drone photography. I am exciting and smart, but can also be very sneaky and a bit boring.");
        d3.setGender("Male");
        d3.setEmail("yo@m.com");
        d3.setPhone("123123123");
        d3.setAddress("Avenida dos Aliados");
        d3.setCountry("Austria");
        d3.setCity("Viena");
        d3.setWeight("200");

        d4.setId(4);
        d4.setRace("Hindu");
        d4.setFirstName("Gonçalo");
        d4.setBloodType("B+");
        d4.setEyeColor("Black");
        d4.setHairColor("Black");
        d4.setImgURL("https://images.generated.photos/QFeQO07F8IGpBP8nx33PJAnH78lW6WGAYoTtRleWN3M/rs:fit:512:512/Z3M6Ly9nZW5lcmF0/ZWQtcGhvdG9zL3Yz/XzA1MjQ1NzFfMDcy/OTI4MF8wMDg4MDY0/LmpwZw.jpg");
        d4.setBi("123123123");
        d4.setLastName("P");
        d4.setAge(35);
        d4.setBio("I am Indian who define myself as gay. I finished school and then left academia. I am allergic to Brazil nuts.");
        d4.setGender("Male");
        d4.setEmail("yo@m.com");
        d4.setPhone("123123123");
        d4.setAddress("Avenida dos Aliados");
        d4.setCountry("Austria");
        d4.setCity("Viena");
        d4.setNacionality("Indian");
        d4.setWeight("65");

        d5.setId(5);
        d5.setRace("Aethiopian");
        d5.setFirstName("Luis");
        d5.setBloodType("B+");
        d5.setEyeColor("Black");
        d5.setHairColor("Brown");
        d5.setImgURL("https://images.generated.photos/DezvybmbIqQicw-3av794UCJhh3L3VaOMyxItYNVvMU/rs:fit:512:512/Z3M6Ly9nZW5lcmF0/ZWQtcGhvdG9zL3Yz/XzAyNjMyNzdfMDAx/OTMyOF8wNTQ5MTI3/LmpwZw.jpg ");
        d5.setBi("123123123");
        d5.setLastName("E");
        d5.setAge(34);
        d5.setBio("I am Luis, my most recent romance was with a sous chef called Michele Ruben Bush, who was 15 years older than me.");
        d5.setGender("Male");
        d5.setEmail("yo@m.com");
        d5.setPhone("123123123");
        d5.setAddress("Avenida dos Aliados");
        d5.setCountry("Italy");
        d5.setCity("Rome");
        d5.setNacionality("Mexican");
        d5.setWeight("80");

        d6.setId(6);
        d6.setRace("Caucasian");
        d6.setFirstName("Romeu");
        d6.setBloodType("B+");
        d6.setEyeColor("Blue");
        d6.setHairColor("Brown");
        d6.setImgURL("https://generated.photos/face/joyfull-white-adult-male-with-short-brown-hair-and-blue-eyes--5e68805e6d3b380006f02adb");
        d6.setBi("123123123");
        d6.setLastName("R");
        d6.setAge(27);
        d6.setBio("I am Romeu, 27-year-old student who enjoys cookery, podcasting and ferret racing. I am creative and entertaining, but can also be very unintelligent and a bit cowardly.");
        d6.setGender("Male");
        d6.setEmail("yo@m.com");
        d6.setPhone("123123123");
        d6.setAddress("Avenida dos Aliados");
        d6.setCountry("Germany");
        d6.setCity("Berlin");
        d6.setNacionality("Polish");
        d6.setWeight("80");

        d7.setId(7);
        d7.setRace("Caucasian");
        d7.setFirstName("Ped");
        d7.setBloodType("B");
        d7.setEyeColor("Black");
        d7.setHairColor("White");
        d7.setImgURL("https://images.generated.photos/xytqPHdRQ4u-9kpWsYXbexbWxjGtCfPlesYJEGJtBhI/rs:fit:512:512/Z3M6Ly9nZW5lcmF0/ZWQtcGhvdG9zL3Yz/XzA1OTM2MTcuanBn.jpg");
        d7.setBi("123123123");
        d7.setLastName("S");
        d7.setAge(60);
        d7.setBio("I am Ped, and love to give my milk to others");
        d7.setGender("Male");
        d7.setEmail("yo@m.com");
        d7.setPhone("987654321");
        d7.setAddress("Avenida dos Aliados");
        d7.setCountry("Portugal");
        d7.setCity("Porto");
        d7.setNacionality("Portuguese");
        d7.setWeight("100");

        d8.setId(5);
        d8.setRace("Caucasian");
        d8.setFirstName("Joao");
        d8.setBloodType("B+");
        d8.setEyeColor("Black");
        d8.setHairColor("Brown");
        d8.setImgURL("https://generated.photos/face/neutral-white-adult-male-with-short-brown-hair-and-brown-eyes--5e6812416d3b380006d793af");
        d8.setBi("123123123");
        d8.setLastName("M");
        d8.setAge(33);
        d8.setBio("Im Joao, 33-year-old semi-professional sports person who enjoys jigsaw puzzles, bowling and yoga. I am stable and inspiring, but can also be very untrustworthy and a bit standoffish.");
        d8.setGender("Male");
        d8.setEmail("yo@m.com");
        d8.setPhone("123123123");
        d8.setAddress("Avenida dos Aliados");
        d8.setCountry("Italy");
        d8.setCity("Rome");
        d8.setNacionality("Spanish");
        d8.setWeight("60");

        d9.setId(5);
        d9.setRace("Caucasian");
        d9.setFirstName("Pedro");
        d9.setBloodType("B+");
        d9.setEyeColor("Black");
        d9.setHairColor("Black");
        d9.setImgURL("https://generated.photos/face/joyfull-white-adult-male-with-short-brown-hair-and-brown-eyes--5e68149e6d3b380006d81e67");
        d9.setBi("123123123");
        d9.setLastName("C");
        d9.setAge(40);
        d9.setBio("I am Japanese who define myself as pansexual. I started studying law at college but never finished the course.I have severe phobia of dogs");
        d9.setGender("Male");
        d9.setEmail("yo@m.com");
        d9.setPhone("987678987");
        d9.setAddress("Avenida dos Aliados");
        d9.setCountry("Germany");
        d9.setCity("Berlin");
        d9.setNacionality("Japanese");
        d9.setWeight("120");

        d10.setId(5);
        d10.setRace("Caucasian");
        d10.setFirstName("Diogo");
        d10.setBloodType("B+");
        d10.setEyeColor("Black");
        d10.setHairColor("Brown");
        d10.setImgURL("https://generated.photos/face/joyfull-white-adult-male-with-short-brown-hair-and-brown-eyes--5e6814e76d3b380006d82f71");
        d10.setBi("123123123");
        d10.setLastName("Cr");
        d10.setAge(29);
        d10.setBio("I am Diogo and I am a 29-year-old junior programmer who enjoys vandalising bus stops, escapology and bargain hunting. I am kind and inspiring, but can also be very violent and a bit sadistic.");
        d10.setGender("Male");
        d10.setEmail("yo@m.com");
        d10.setPhone("987678567");
        d10.setAddress("Avenida dos Aliados");
        d10.setCountry("Italy");
        d10.setCity("Rome");
        d10.setNacionality("Portuguese");
        d10.setWeight("50");





        listDonors.add(d1);
        listDonors.add(d2);
        listDonors.add(d3);
        listDonors.add(d4);
        listDonors.add(d5);
        listDonors.add(d6);
        listDonors.add(d7);
        listDonors.add(d8);
        listDonors.add(d9);
        listDonors.add(d10);


    }



    @Override
    public Donor get(Integer id) {
        return listDonors.get(id - 1);
    }

    @Override
    public List<Donor> listDonors() {
        return listDonors;
    }

    @Override
    public void save(Donor donor) {
        listDonors.add(donor);
    }

    @Override
    public void update(Donor donor) {

        int id = donor.getId();

        listDonors.remove(id - 1);

        listDonors.add(id - 1, donor);

    }

    @Override
    public Product createProduct(Donor donor, Product product) {

        donor.getProductList().add(product);
        donor.setNumberSamples(donor.getProductList().size());

        productService.getListProducts().add(product);

        return product;
    }

    @Autowired
    public void setProductService(ProductServiceImp productService) {
        this.productService = productService;
    }
}
