package com.lukmannudin.assosiate.myrecyclerview;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][]{
            {
                    "The Shape of water",
                    "2017",
                    "https://i-h2.pinimg.com/564x/1d/a3/94/1da3947827f21494ee70e615865b2e58.jpg",
                    "Elisa is a mute, isolated woman who works as a cleaning lady in a hidden, high-security government laboratory in 1962 Baltimore. Her life changes forever when she discovers the lab's classified secret -- a mysterious, scaled creature from South America that lives in a water tank. As Elisa develops a unique bond with her new friend, she soon learns that its fate and very survival lies in the hands of a hostile government agent and a marine biologist"
            },
            {
                    "Dunkirk",
                    "2017",
                    "https://i-h2.pinimg.com/564x/dc/00/0c/dc000c16d9fc3bc39e44f5412e140188.jpg",
                    "In May 1940, Germany advanced into France, trapping Allied troops on the beaches of Dunkirk. Under air and ground cover from British and French forces, troops were slowly and methodically evacuated from the beach using every serviceable naval and civilian vessel that could be found. At the end of this heroic mission, 330,000 French, British, Belgian and Dutch soldiers were safely evacuated."
            },
            {
                    "Widows",
                    "2018",
                    "https://i-h2.pinimg.com/564x/5b/15/4a/5b154a1676565ffc5e3f745ae4f31c72.jpg",
                    "A police shootout leaves four thieves dead during an explosive armed robbery attempt in Chicago. Their widows -- Veronica, Linda, Alice and Belle -- have nothing in common except a debt left behind by their spouses' criminal activities. Hoping to forge a future on their own terms, Veronica joins forces with the other three women to pull off a heist that her husband was planning."
            },
            {
                "The Dark Knight",
                    "2008",
                    "https://i-h2.pinimg.com/564x/5d/55/f6/5d55f69bbe7948d202dffbbea4b857d8.jpg",
                    "The Dark Knight is a 2008 superhero film directed, co-produced, and co-written by Christopher Nolan. Based on the DC Comics character Batman, the film is the second part of Nolan's The Dark Knight Trilogy and a sequel to 2005's Batman Begins, starring an ensemble cast including Christian Bale, Michael Caine, Heath Ledger, Gary Oldman, Aaron Eckhart, Maggie Gyllenhaal and Morgan Freeman. In the film, Bruce Wayne / Batman (Bale), Police Lieutenant James Gordon (Oldman) and District Attorney Harvey Dent (Eckhart) form an alliance to dismantle organized crime in Gotham City, but are menaced by an anarchist mastermind known as the Joker (Ledger), who seeks to undermine Batman's influence and turn the city to chaos."
            },
            {
                "La La Land",
                    "2016",
                    "https://i-h2.pinimg.com/564x/d6/35/cd/d635cdb221ece8e2ed06637f6d8503c1.jpg",
                "Sebastian (Ryan Gosling) and Mia (Emma Stone) are drawn together by their common desire to do what they love. But as success mounts they are faced with decisions that begin to fray the fragile fabric of their love affair, and the dreams they worked so hard to maintain in each other threaten to rip them apart."
            },
            {
                "Pengabdi setan",
                    "2017",
                    "http://t2.gstatic.com/images?q=tbn:ANd9GcSxMprcN3-6yiVjsQskhvIE8xIB8Ms2Ci4H-F7myzINEMucWx7Z",
                    "Setelah sakit aneh selama 3 tahun, Ibu akhirnya meninggal dunia. Bapak lalu memutuskan untuk kerja di luar kota meninggalkan anak-anak. Tak lama kemudian, anak-anak merasa bahwa Ibu kembali berada di rumah. Situasi semakin menyeramkan ketika mereka mengetahui bahwa Ibu datang lagi tidak sekedar untuk menjenguk, tapi untuk menjemput mereka.",
                ""
            },
            {
                "12 Years a Slave",
                    "2013",
                    "https://i-h2.pinimg.com/564x/35/83/1f/35831f0a3d71acadb48ffb012956c626.jpg",
                "In the years before the Civil War, Solomon Northup (Chiwetel Ejiofor), a free black man from upstate New York, is kidnapped and sold into slavery in the South. Subjected to the cruelty of one malevolent owner (Michael Fassbender), he also finds unexpected kindness from another, as he struggles continually to survive and maintain some of his dignity. Then in the 12th year of the disheartening ordeal, a chance meeting with an abolitionist from Canada changes Solomon's life forever."
            }
    };

    public static ArrayList<President> getListData() {
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            president = new President();
            president.setName(data[i][0]);
            president.setYear(data[i][1]);
            president.setPhoto(data[i][2]);
            president.setDescription(data[i][3]);
            list.add(president);
        }
        return list;
    }
}
