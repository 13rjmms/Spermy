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
        d1.setRace("Black");
        d1.setFirstName("Gonçalo");
        d1.setBloodType("A+");
        d1.setEyeColor("Black");
        d1.setHairColor("Black");
        d1.setImgURL("data:image/jpeg;base64,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");
        d1.setBi("123123123");
        d1.setLastName("C");
        d1.setAge(27);
        d1.setBio("I am Gonçalo C, 27-year-old government politician who enjoys chess, competitive dog grooming and photography. I am friendly and brave, but can also be very disloyal and a bit stingy.\n" +
                "\n" +
                "I am Portuguese who defines himself as pansexual. I started studying philosophy, politics and economics at college but I never finished the course.");
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
        d2.setImgURL("https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
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
        d3.setImgURL("https://www.irreverentgent.com/wp-content/uploads/2018/03/Awesome-Profile-Pictures-for-Guys-look-away2.jpg");
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
        d4.setImgURL("https://storage.googleapis.com/support-forums-api/avatar/profile-9630-14448056927501220901.jpg");
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
        d5.setRace("Black");
        d5.setFirstName("Luis");
        d5.setBloodType("B+");
        d5.setEyeColor("Black");
        d5.setHairColor("Brown");
        d5.setImgURL("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxISEhUSEhMWFhUVFxoVFRgYFRUXFxgVFRYXFxUXFRUYHSggGBolGxUVITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OFQ8PFSsZFR0tLSsrKystKy0rLS0tKy03LSsrLSstLS0tKzc3Ky0rNy03NysrLSsrKysrNysrKystK//AABEIAOAA4AMBIgACEQEDEQH/xAAcAAABBQEBAQAAAAAAAAAAAAAAAgMEBQYBBwj/xAA8EAABAwEGAwUFBgYCAwAAAAABAAIRAwQFEiExQQZRYRMicYGRMlKhsfAHI0LB0eEUFWJygvEzQyQ0kv/EABcBAQEBAQAAAAAAAAAAAAAAAAABAgP/xAAaEQEBAQEBAQEAAAAAAAAAAAAAARECITFB/9oADAMBAAIRAxEAPwD2tCEKAQhCAQhCAQhCBNR4AkqlvC0ggmc8wIE96CQBtMSpdurE5D/XVVV42kiQ0YSDrIEjeOR1jzUtWRWWxziQZe1mCSwzmcu62N9jpqotSuD91hwzJBOU6Zk6Buoy5KPa7RXawz34hoBMwMWeUZnDl11Kg1bzxVcM9m0DAWkSD7sQdxlH6LDafaLUZmMNNsNBPdy3PPWP2Wat1vDpIcIzc0FsQWiAdTMxMHmOsu3ve5FJwbUOI5ZgaDWevTaYWNrWwvaWzMnMnuzoNNtJ81FxPs17AuJIYC52sAGPEpy2Xy4HC0N1MwGkkcjzbkTPPMLL1QYz0nIyP0SjanZSTpETijw9UVf1b6qipLSQR7DgI6Q+J6Z+C9b4I4ubWApVnQ/RuMiXHUjFOeog5Lw+jbmmcpnXWRHL62Vtdl54XNe0uAnFic+cJEA92Mo1VlxLNfR6FT8L3uLTRDvxNycPkfPmrhdHIIQhAIQhAIQhAIQhAIQhAIQhAIQhAJFV0AlLUa1u2QVloqCSSchAA5nL91WtsT3vJb7I22xA5/I/up1YiYaRO3Q7eWfmrSz0sDAOmuizmtM1et0ucIGe86RCyN/XeTqSAI2zOufx1XqListf1RpkEDoFLFleSW5rgcQGmWp209FUV8WeLOT6fRW8vHs/d+tlm7ZZmk6/BZbZ+tQ3Cj9mdvEfor6lZBzTzbsbrPTZXUxSU6MZzB128Fyi4tzzGYIy31MdDuN1p6N1sG0qvvS7A1hIHX4qGNZ9lPEXZ1+zdo/ukEgASe6Rz3EL20L5RsFqLKjXcj+8r6e4dtvb2alV95onxiD8lvmsdLFCELTIQhCAQhCAQhCAQhCAQhCAQhCAUS07/BS1DtRiUFZQpEu0IbOcgSeUbq1qmAo1mB31RbX5e1h8VIpi02qJOwCxN/XgQSYkHfL4K6tTHGWmqCNch+Wiy/EVF7WgsY9xjUxCxa1IoLxt7ZiPgqatXE5J+1V627Y82qKXVOQ9VGxTrwVY0TKrC5w1YD4EKdZ6rYkyBH1n6ILRnimqrQWubrkUxSryPaQKyDJvYWuLTocgY3Xvn2S1y6whpM4HFvkvEbys7gcWeuu0TmvYfsa/9aoCZ748u7ktc/Wevj0JCELbmEIQgEIQgEIQgEIQgEIQgEIQgh220lrmMA9vF5YQDP1zXHOJHVIvi0tpND3ZH2Qehgn5BIuu0tqtFRpyPzGqinmNzKh3laaYaQSFMtdYNaVi75a5wJJAHjt1zUtwhyrZQ90tzHRxCoL/AKLMDxiqSJyxgz8FU2p1ZohlZvTMjy+Sz14Wu25glxGmUOyJ5rLeG3tYfxO8yP0SDSGXePhombE58gOGc8lYVW5yBoFGkKq2CBnz1nJThUhoGp+v3VLbLS6Z5aeCabfUHNmiJrRU6TtmwnW0uapRxC9xAa0N5wNfVWtlrF8Gev8AtFS/4HtGFs7L0/7LLJ2dj6uedYnu5QeeixNz0A5wB5J7ge0uF4UaLXHD94/CdGsaHTHi4j4q8/U69j2JCELo5BCEIBCEIBCEIBCEIBCEIBCEIM3x3Y6lSz/dAlzXTA1Ig6JzhCz4LKyfacMbgdsWgjwA85V+VW3bTcMYcQe8SOjScgVM9WXxFvKpCy14UaeI1LTVLKLYhrZx1HumGtAz22zM9CtnbaGIFUtrpU3NexzWkOEZj63j0Uqx4/xja6GPDTs9en1e4gn/ABJVRTq1rOQTjAOgeCJjWDvC1XF9z1HkTVcQ2cOKC4SAIxxiOQGp2CzF716tVrKb35MybDQAOvMnzWW17d1VtobiaO8Dn4pu1WYtJHSUrg663jTfMnbx+atL2pFtVrT7v7qKxt4Owe0qKtaTMiByyzWm4lsReJH4fzWebUODsob7WIHDDg7TWcx0KsSpN12iSMbwORe0hpPLHsr8VO9mBI6zkdHNO4OefRQrktbmUzTIY7FIGJuINDvaIZuTzJPgrW7rlZTaIJIjQ5x0+fqlIv8AhyvLp1gH5Fab7KbC2oalrI7zS6gw/wBMhx9clnboszhRrFg70BrQPedkIXpfBFyfwdkp0j7Xtv8A7nZn00V5idVerqELbmEIQgEIQgEIQgEIQgEIQgEIQgExUpAOxDcQfLRPpDyNEESq/JZe9K8SRsr23OyWTvOTKza1FBetpL8lFuzhttRwL9OXRTP4bOeqn3TVLqzaTRJJz6ZFYbaC7bsYzJrYjJZLi6hhtAI3C9LdTDG8oXnnF7w+q1w10WrElU1osjCS07qhtVwNxSNFpLwsroxN9pV1lr4pB1GRHIj/AGstG7vu6k3PU9VYuaIUQmEw61yQEHofBVlBLQeeP/5ED4uHot8vPOFLUMD3gxBFNs6Zd52fi4ei2d33k14g5EZEfWoW+XPpYISQ8IDgtMlIQhAIQhAIQhAIQhAISS6E3UrgIHSU06uFVWy3k1m0m6hmM+ZgfIqUHBjS55iBKmqRfV7Ms1I1KhiNB1VNwXe7rTSfXefbq4W/2tAgesry37TOKnWir2TD3Gnbdb/7PaZF3UY9/GfDEpvq40t5nVUNaiCVfXm0nLY/QVVRgz0SrFFedDCMknhNvYVTVqDMtdHpK0gu4FuN40zA8dFnb0vSkx4BcBJiJGRHNZ+L9Vtq+0SnUtJo98NOWLD3QdpOw6qrvQllUEmQDKhcV3rZuyf2TG9o4iXj9jqse+/6mANJkgQCc4GyfVnjbWviym17WYZPSfioFue7tO2AID9RyyCzlgvzCe8xruuh1zzC0dlvCnXbhBziIOvRRUg2iWz9c1UWmvGYKbfVLSWnZVdptfM6INBcnE7qAfTLcTDnrnJ3Vtw/xbUfacAccDm5NOx6FYBteZKduKvFpp+KqPXeHOJLQ62vY5xNNrIcJkB05R5StJxxxWLHQaWd6o8w1u5novOeF77bRFtrOGL70NYN3OjIBQrfxG5lTtngVbW/KmzVtEHQAbuzTUx6lw7fVpwB9pcxjXZhj/b9QfgVau4vsjajaLqkPfkMsvM7Ly9lOtQa01ya9vtGVGlMinO5AyaANT0Wz4T4Pp2UdtaD21pdm5xzDebWDYdVZalkbtrgcxohV/bwkOtXVb1nFohV1O3dZUylXDtCiYcTdWqBqYSKonQqDaqkZPEg7pqnKtYOaYKzV5X3DXNmHNOas30iwE0ziHLdY3iaxi0Amm7DWaMtg7+l36rFrUi5uu1udbqztuypgfE/mVH+0G8307M6HRKquDL0xVcLwW1OzwPB1xMP6FL+0LvUT0TV/XjFesXOMlfQ/A9L/wABjP6APUL50rCHr6A4Ft2KxsPQAeIyUhV0y19pTB3HdP8Ac3J3yKiNd3tcvHVUV4W42e0lhJDLR3mHYVRkW/5AT4gqTTtAOcxJk5aQduSamOfaVxCLNQFJhIe5mIRyGXzjJeQF9eu4FsvIk5Dfdbr7SapqNaDMtEajrmRP9qy3DV1tcTNR1NwEhzXZGRoQNkakVNW6q5EYI5yQof8AJKoOeEDx/IL0G8rrLaZLXmRE6HF1Eg81SNsZdrUOXQAzMn5hQxmv5Q4aPb54h8YUSpipug6jrPXULW3hSohukRuSSSeizF4AEy0QPr1VKmVLcXUw46xh8TzVPaapgDYlLe8wB9ZqNbHZgcgrEqVSfki7a+GoX+6DHidExiyRYBJAOhOI+ATE1p2W8Wag061HS5g90u1eevJWvBdmbZ6VS87SJLcqAP4nn8XjsPNZGkDaLQAdJ+A0C9BvINfVs1n0pUQKjxzI2I8YUVsOCbtNNptto71pr55/gYcwxvLKJWitV4tp+0RiKztK926kwGtxHo0LKXPf38TanvJhjMTs9MIz+QTTG8va/W2djS93ff7I3P1koD77hpe7QfM6BeW2y+nWy24ye7iw0xsGzA/VW9vvYPtdOzTFGj95VM6imMTp9APNNMja33xU2xUGvfnWq5sbyGxITnD97V3sFWqYnPlkvKHXp/HWx9ormKVPvRsGA91g6n9U/V4mtFrqinSlrScLWjZu0nw3Qx9EuqbHJQq9oqM1GNp+SZZbMcsfk4fUpJthb3XZha1nCadVju9Rfhd7hOR6KsvSi2qTAw1W5kaYk5eVna8YmGDtH5qifeoceytBwub7D9xy8Qs61Io74Y9jhaWT2tMiR7zdx6KbfdtbaKDajc2uE+vPqCm7daiXYXkCpEiPZqs95vVUlGv2LzT/AOurJZyDj7TVFxib1olrlqOEeJjZ6bmuD3Ye82CABzkHUKBf1lmTyy0+Kq7urkB1OG97uy4SQDyVHrt8U22uyh7T7TRUpu3a7VpHmspYOInAgvHfYcFVvOPqVbcOWhrbKKAdJpCPLbyWU4koEO7ZmujxzUG3vWqyvSa8AYSMsxI6T4/JYuuzA47ZajIGcs51zhNXFfv/AFOd927MSfZP5Smr3twa/QCRlHwMDbRBGtF9VmZMqHDlAOY6aqB/P65ykA/2wo9oqzt9FQicyqmp77U5xl7pJSX1JUE1P3XXPJMBXArdR6hlycqOhIpNjMqxBXdsnLOYBPl+qjky5Oj2UFlcFTC/EeYHkrN96F1VzvqFnrNVgLoq69VLFlaq8r/d2FSCfvHCm2NmNElVl3W/srLWg96pFMeBku+A+KpbRXxNaOS6+qezA6k/kmGrDh6vhqtd7su9AkstxwV3z3qpDf8AGcTh4Eho8lX2arhDz/Th9f8ASZB7scyFcTUv+ILaXZjV7sbuuzR8/VXFhtDbNSIH/K8Q4j8I90H5qkspE4z/AI/qk1a2IpTX0RaLxEh8w4a+G8otF5gGJBkSPBYa12+Jh26jW69XdlTdilw+Un1WNaxu6lugS09SsxxJVDxkc9QfyVNUvsxkdfoqstV4knM/FDEmlegqs7Ko6C09x27D+h3Ch2iu803U35PpnE0+G46FVNoqmcQUg2nG0HdvxHIqmrSjbO3pbSNeapnsLHSmbHauzq/0lWdqYHZjTYqC1ueuZ7gJc7IgbhP2uo18iQSMiMslRUKhDTqJyJBjI6z0Uu+n0aTbO2lUZUrd41TTdia1jowscdC7fyRVLellwOxN03CafbMbQHbCAd/BXVrAcJhZ62WfA6RoVWa488kyQuY0h1RaxHHmE60QM9d01RbJk6D5p1xShuN+a5VdsluKjuKIVTGpTr9EkDIBdeUCWnJdlcQqEuXHHLzXXJBQdnKEMC4V1o2G6qHpLiGtHgFPsFANdDQHvAkk5U6Y5nn9ZJqy0sj3sLR/yP8Ak1vM9FyrXL/u6TcLJyA1J955/EflsstNBUtpEtORGR6jZMVLTNMD3SR5HNMXg4GHjQ/UHwUVlTbmstakGqYTb3prEhxyRA9y5ZKkOjmuSmqhgygXWbnHL5Kyu2vIwO20VdXOjuaDUw94bINFQDTIUqzXbTO2u/Iqss1rBE+vVS/5iQ2FGkupTAJbAyVRfVmhsldrXk/N5OQ7sR7R8dlX223vqATkNArEqmqZGEglP2lu6RZmS7oMz4BbYPYcIA8z4lJlKe5NnIKKRUM5JMZwlNG6VRGpVQfi8FxyKe5QUAuLqSSoEuKS5KKQVoKTtnbny68huU0E+0Rlzy8lBPstldXIa3usbp+p5lau6bvp0gIEu5n8lR2B+AABW1G1fusVuM02tsdD8/3TJMFNkygOkQqh4OXA7JMh2fklUzkmB2UmoEBD0C6feYRyTQS7IcyOYXHtgohdhrES30UvGqw5GVOD5EhFhNd7iIBy1hN1Ksho2b8zqU45u6YeFAzVXbO2Gk7uMeQTdQqTVEQOQj6+K0hkpDhKWVwqBt/JOPEM8Vym2Su2o6BUIZ7K4lbBcARHCkFOFNlIElchdSgMlRxqmMaTB1hRxTls+isLDZ3DC4CZyLfmpVh6hUUxteB9ckq97lrWfBUdTe2nVE03EEAxqJ5iVX4llUCUg5FPvEpojZWIbDtfBO0zkmGhSGhWhYSiuALpWVJomHhP12qMdQVLqaqpEVwTtndGSS8JylTlFOkeiZqNT2AjU5KNVqKBqiJeOmfouEmSihq49I9UoqoSuFdK5CIcpNUesZcpRMBRN1YtOELiU9JlBxyQUpyQVUchOOHd80loT9Vvdagl2WzFzafWT8V699mPAgqYbTXb3AZaD+L9llOGLiNRtAAZuaAPFxX0XZaApsbTaIDQGgDkBCzPat8Qr9uSha6DrPWbLHDKNWkey5h2IXzdxlwvWu+0GlUzac6T4yezmORGhG3mF9Rqp4m4eoW6iaNdsjVjh7THbOYdj81qzWZXyY5qSQlELhWWnaVnnNKazNXd3WGWgxqJUHsYcQoqIWJDlPdRUSqIQRnqbV+YCiEKZXGTT0VEZ6kUjAUcpxzslAmrVJUdycJSCFUcpaHxXXIZoPNJPRB0rrAkpymg5XcozNQnKzk2zVUO1ElKqJKDhSEpyQqh5gUmuz2R0TVnbIUuo2agHgFmq+hPs3ugCnSqkewwR/cR+i3yrOG7J2VmpN3wAnxICsKtQNBc4wAJJWpMZt0pxjMqptl+sbkxpeeejfXU+ir7feBq6yGbNkierv0Vbaa4Guh0UtWR/9k=");
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
        d6.setImgURL("https://www.american.edu/uploads/profiles/large/auheadshot2_smallsizeforprofile_2.JPG");
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
        d7.setImgURL("https://lh3.googleusercontent.com/proxy/wLLrwDfH0scirTFcDbg77Dm6loM5qv1L7MUnvX190jQNWKIVDG9HPCqhH_YvAge0MCtZDD4FjoQ2uVUTIV1wqKatp8Q-Cp0ivrBrAtGcIUhX_BbcYTQTyw4_Xw0kFxKFSnV4NrbLMjcjohYC3HrPzmYl");
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
        d8.setImgURL("https://wpecommerce.org/wp-content/uploads/2014/11/lee-profile-600x600-300x300.jpg");
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
        d9.setImgURL("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRIPBKnvZ-614trLnQj2UiAnhgOTsOhwvqtMA&usqp=CAU");
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
        d10.setImgURL("https://preview.keenthemes.com/metronic-v4/theme/assets/pages/media/profile/profile_user.jpg");
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
