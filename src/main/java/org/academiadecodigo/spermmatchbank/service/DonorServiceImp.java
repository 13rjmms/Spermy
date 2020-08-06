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
        d1.setRace("Caucasian");
        d1.setFirstName("Nuno");
        d1.setBloodType("A+");
        d1.setEyeColor("Blue");
        d1.setHairColor("Black");
        d1.setImgURL("https://image.shutterstock.com/image-photo/portrait-stylish-midget-mc-headphones-260nw-1247042659.jpg");
        d1.setBi("123123123");
        d1.setLastName("Midget");
        d1.setAge(18);
        d1.setBio("I'm addicted to give sperm");
        d1.setGender("Male");
        d1.setEmail("nuno@m.com");
        d1.setPhone("123123123");
        d1.setAddress("Avenida de Roma");
        d1.setCountry("Portugal");
        d1.setCity("Lisboa");
        d1.setWeight("90");

        d2.setId(2);
        d2.setNacionality("Russian");
        d2.setRace("Gypsy");
        d2.setFirstName("Diogo");
        d2.setBloodType("B+");
        d2.setEyeColor("Black");
        d2.setHairColor("Black");
        d2.setImgURL("https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        d2.setBi("123123123");
        d2.setLastName("Midget");
        d2.setAge(21);
        d2.setBio("I love to give my milk to others");
        d2.setGender("Male");
        d2.setEmail("yo@m.com");
        d2.setPhone("123123123");
        d2.setAddress("Avenida dos Aliados");
        d2.setCountry("Portugal");
        d2.setCity("Porto");
        d2.setWeight("200");

        d3.setId(3);
        d3.setNacionality("Russian");
        d3.setRace("Gypsy");
        d3.setFirstName("Filipe");
        d3.setBloodType("B+");
        d3.setEyeColor("Black");
        d3.setHairColor("Brown");
        d3.setImgURL("https://www.irreverentgent.com/wp-content/uploads/2018/03/Awesome-Profile-Pictures-for-Guys-look-away2.jpg");
        d3.setBi("123123123");
        d3.setLastName("Midget");
        d3.setAge(25);
        d3.setBio("I love to give my milk to others");
        d3.setGender("Male");
        d3.setEmail("yo@m.com");
        d3.setPhone("123123123");
        d3.setAddress("Avenida dos Aliados");
        d3.setCountry("Austria");
        d3.setCity("Viena");
        d3.setWeight("200");

        d4.setId(4);
        d4.setRace("Black");
        d4.setFirstName("Gonçalo");
        d4.setBloodType("B+");
        d4.setEyeColor("Brown");
        d4.setHairColor("Brown");
        d4.setImgURL("https://storage.googleapis.com/support-forums-api/avatar/profile-9630-14448056927501220901.jpg");
        d4.setBi("123123123");
        d4.setLastName("Midget");
        d4.setAge(35);
        d4.setBio("I love to give my milk to others");
        d4.setGender("Male");
        d4.setEmail("yo@m.com");
        d4.setPhone("123123123");
        d4.setAddress("Avenida dos Aliados");
        d4.setCountry("Austria");
        d4.setCity("Viena");
        d4.setNacionality("Indian");
        d4.setWeight("65");

        d5.setId(5);
        d5.setRace("Black");
        d5.setFirstName("Miles");
        d5.setBloodType("B+");
        d5.setEyeColor("Black");
        d5.setHairColor("Brown");
        d5.setImgURL("https://cdn.business2community.com/wp-content/uploads/2014/04/profile-picture-300x300.jpg");
        d5.setBi("123123123");
        d5.setLastName("Midget");
        d5.setAge(20);
        d5.setBio("I love to give my milk to others");
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
        d6.setEyeColor("Yellow");
        d6.setHairColor("Brown");
        d6.setImgURL("https://www.american.edu/uploads/profiles/large/auheadshot2_smallsizeforprofile_2.JPG");
        d6.setBi("123123123");
        d6.setLastName("Midget");
        d6.setAge(27);
        d6.setBio("I love to give my milk to others");
        d6.setGender("Male");
        d6.setEmail("yo@m.com");
        d6.setPhone("123123123");
        d6.setAddress("Avenida dos Aliados");
        d6.setCountry("Germany");
        d6.setCity("Berlin");
        d6.setNacionality("Polish");
        d6.setWeight("80");

        d7.setId(7);
        d7.setRace("Black");
        d7.setFirstName("Ped");
        d7.setBloodType("B");
        d7.setEyeColor("Black");
        d7.setHairColor("Black");
        d7.setImgURL("https://lh3.googleusercontent.com/proxy/wLLrwDfH0scirTFcDbg77Dm6loM5qv1L7MUnvX190jQNWKIVDG9HPCqhH_YvAge0MCtZDD4FjoQ2uVUTIV1wqKatp8Q-Cp0ivrBrAtGcIUhX_BbcYTQTyw4_Xw0kFxKFSnV4NrbLMjcjohYC3HrPzmYl");
        d7.setBi("123123123");
        d7.setLastName("D");
        d7.setAge(31);
        d7.setBio("I love to give my milk to others");
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
        d8.setImgURL("https://wpecommerce.org/wp-content/uploads/2014/11/lee-profile-600x600-300x300.jpg");
        d8.setBi("123123123");
        d8.setLastName("M");
        d8.setAge(33);
        d8.setBio("I love to give my milk to others");
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
        d9.setEyeColor("Blue");
        d9.setHairColor("Brown");
        d9.setImgURL("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRIPBKnvZ-614trLnQj2UiAnhgOTsOhwvqtMA&usqp=CAU");
        d9.setBi("123123123");
        d9.setLastName("A");
        d9.setAge(19);
        d9.setBio("I love to give my milk to others");
        d9.setGender("Male");
        d9.setEmail("yo@m.com");
        d9.setPhone("987678987");
        d9.setAddress("Avenida dos Aliados");
        d9.setCountry("Germany");
        d9.setCity("Berlin");
        d9.setNacionality("Russian");
        d9.setWeight("120");

        d10.setId(5);
        d10.setRace("Caucasian");
        d10.setFirstName("Diogo");
        d10.setBloodType("B+");
        d10.setEyeColor("Black");
        d10.setHairColor("Brown");
        d10.setImgURL("https://preview.keenthemes.com/metronic-v4/theme/assets/pages/media/profile/profile_user.jpg");
        d10.setBi("123123123");
        d10.setLastName("Cr");
        d10.setAge(29);
        d10.setBio("I love to give my milk to others");
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
