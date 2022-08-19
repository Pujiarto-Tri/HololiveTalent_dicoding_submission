package com.pujiarto.hololivetalent.data

import com.pujiarto.hololivetalent.R

object TalentsData {
    private val talentNames = arrayOf(
        "Tokino Sora",
        "Robocosan",
        "Yozora Mel",
        "Aki Rosenthal",
        "Akai Haato",
        "Shirakami Fubuki",
        "Natsuiro Matsuri",
        "Minato Aqua",
        "Murasaki Shion",
        "Nakiri Ayame",
        "Yuzuki Choco",
        "Oozora Subaru",
        "AZKi",
        "Ookami Mio",
        "Sakura Miko",
        "Nekomata Okayu",
        "Inugami Korone",
        "Hoshimachi Suisei",
    )

    private val talentJp_Names = arrayOf(
        "ときのそら", //sora
        "ロボ子さん", //roboco
        "夜空メル", //mel
        "アキ・ローゼンタール", //aki
        "赤井はあと", //hachaama
        "白上フブキ", //fubuki
        "夏色まつり", //matsuri
        "湊あくあ", //aqua
        "紫咲シオン", //shion
        "百鬼あやめ", //ayame
        "癒月ちょこ", //choco_sensei
        "大空スバル", //subaru
        "AZKi", //Azki
        "大神ミオ", //mio
        "さくらみこ", //miko
        "猫又おかゆ", //okayu
        "戌神ころね", //korone
        "星街すいせい", //suisei

    )

    private val talentDescriptions = arrayOf(
        """
            “Hey, Sora-tomo! How are you all doing? It's me, Tokino Sora!”
            hololive Production's first virtual idol, debuting on September 7, 2017. She loves horror games and singing, and has always dreamed of performing in Yokohama Arena.
            She signed a record deal with Victor Entertainment in March 2019. She is active in various forms of media, such as appearing in Watanuki-san Chi no and hosting Sora Ao to!, a radio show.
            She held her first solo concert, Dream!, on October 6, 2019, taking one step closer to her ultimate goal.
        """.trimIndent(), //sora
        """
            "Hellobo! Roboco here!"
            A lonely, clunky robot from a faraway wasteland.
            Now that she's a Virtual YouTuber, she wants to interact with
            lots of people and live each day to the fullest.
        """.trimIndent(), //roboco
        """
            "Sweet bites! It's Yozora Mel, the Underworld's vampire prodigy!"
            A vampire prodigy from the Underworld. She might be a vampire, but she is not into blood. She likes her acerola juice quite a lot.
        """.trimIndent(), //mel
        """
            "Alona, everyone! This is Aki Rosenthal a.k.a. AkiRose!"
            A girl who traveled from a different universe. She has hyper curiosity and dabbles in all sorts of things. Her trademark pigtails float due to some sort of supernatural power.
        """.trimIndent(), //aki
        """
            "Welcome to your rouge awakening! This is Akai Haato!"
            A sassy kouhai. She is often prickly, but she'll try to get a lot of attention from those who have made friends with her. She loves red ribbons and heart shapes, and she'll wear them often in her hair and on her clothes.
        """.trimIndent(), //hachaama
        """
            "Good foxy day! I'm Shirakami Fubuki!"
            White-haired animal-eared otaku fox. She loves talking with people and will be happy if you give her the time of day.　
            She aims to become a top otaku idol while enjoying each and every day.
        """.trimIndent(), //fubiki
        """
            "Wasshoi! hololive's symbol of purity and everyone's idol, Natsuiro Matsuri here!"
            A rookie member of her school cheerleading team. Her cheerful, energetic, and affectionate personality means she gets along with everyone and has lots of friends. Loves festivals, events, and other fun things.
        """.trimIndent(), //matsuri
        """
            "A-quality day to one and all! I'm Minato Aqua!"
            A marine maid-styled virtual maid. She is trying her very best, yet is still sometimes awkward and clumsy.
        """.trimIndent(), //aqua
        """
            "Hellshio! Murasaki Shion here!"
            A child that randomly appears around the Underworld Academy... though she's actually an adult (or so she says). A self-proclaimed talented dark magician of noble birth (or so she says).
            She almost never actually says "Hellshio."
        """.trimIndent(), //shion
        """
            "Greetings, Humans! Yoohoo!"
            A kimono-clad Oni girl from the Underworld Academy. As she loves to prank people, she always uses will-o’-the-wisp on them just to have fun. Many may not realize it, but she is actually the president of the student council.
        """.trimIndent(), //ayame
        """
            "Good evening, my cute students! Choc-on!"
            The school nurse at the Underworld Academy. Is incredibly popular among the students, with the boys in particular coming to get checked up all the time. Loves sweets, and often gets into trouble for leaving them strewn about on her desk.
        """.trimIndent(), //choco
        """
            "Sup! I'm Oozora Subaru from hololive 2nd Generation!"
            The manager of an MMA team and an e-sports club. A bright and cheerful girl full of spirit, she can interact with anyone and everyone without hesitation. She's currently working hard on her own pro-gamer skills.
            Another day of giving everything I've got as a manager!!!!!!!!!!!
        """.trimIndent(), //subaru
        """
            A diva who became reborn into the virtual world in order to fabricate a new world. No matter the time, place, or position, she warps through all the barricades with her dazzling talent.
            ©kasokuSato
        """.trimIndent(), //azki
        """
            "Hellooowl! It is Ookami Mio!"
            A black-haired wolf girl who appeared on our radar randomly. She often shows up around shrines. She likes gaming.
        """.trimIndent(), //mio
        """
            “Nya-hello! I'm the elite shrine maiden of hololive, Sakura Miko!”
            Used to work hard in the Virtual Sakura Shrine accomplishing duties as a shrine maiden until, following the gods' orders, she was led to Japan where she found out about Tokino Sora. After developing huge admiration for her, she decided to become a virtual shrine maiden idol and continue to keep working hard for that dream!
        """.trimIndent(), //miko
        """
            "Om, nom, Okayu!"
            A cat being raised by an old woman that runs an onigiri store. She streams from the computer in her grandma's room.
        """.trimIndent(), //okayu
        """
            "'Ello! Fingers! Give me your fingers!"
            A dog from a bakery in the city. She likes to play games during her free time while watchdogging.
        """.trimIndent(), //korone
        """
            "It's your shooting star, your diamond in the rough, idol VTuber Hoshimachi Suisei!"
            A forever18 VTuber who deeply loves singing and idols.
            Her dream is to one day hold a live concert in Tokyo Budokan.
        """.trimIndent(), //suisei
    )

    private val talentBirthdays = arrayOf(
        "May 15", //sora
        "May 23", //roboco
        "October 31", //mel
        "February 17", //aki
        "August 10", //hachaama
        "October 5", //fubuki
        "July 22", //matsuri
        "December 1", //aqua
        "December 8", //shion
        "December 13", //ayame
        "February 14", //choco
        "July 2", //subaru
        "July 1", //azki
        "August 20", //mio
        "March 5", //miko
        "February 22", //okayu
        "October 1", //korone
        "March 22", //suisei
    )

    private val talentDebuts = arrayOf(
        "September 7, 2017", //sora
        "March 4, 2018", //roboco
        "May 13, 2018", //mel
        "June 1, 2018", //aki
        "June 2, 2018", //haachama
        "June 1, 2018", //fubuki
        "June 1, 2018", //matsuri
        "August 8, 2018", //aqua
        "August 17, 2018", //shion
        "September 3, 2018", //ayame
        "September 4, 2018", //choco
        "September 16, 2018", //subaru
        "November 15, 2018", //azki
        "December 7, 2018", //mio
        "August 1, 2018", //miko
        "April 6, 2019", //okayu
        "April 13, 2019", //korone
        "March 22, 2018", //suisei
    )

    private val talentUnits = arrayOf(
        "hololive Generation 0", //sora
        "hololive Generation 0", //roboco
        "hololive 1st Generation", //mel
        "hololive 1st Generation", //aki
        "hololive 1st Generation", //hachaama
        "hololive 1st Generation/Gamers", //fubuki
        "hololive 1st Generation", //matsuri
        "hololive 2nd Generation", //aqua
        "hololive 2nd Generation", //shion
        "hololive 2nd Generation", //ayame
        "hololive 2nd Generation", //choco
        "hololive 2nd Generation", //subaru
        "hololive Generation 0, SorAZ, Shotgun Rose", //azki
        "hololive GAMERS", //mio
        "hololive Generation 0", //miko
        "hololive GAMERS", //okayu
        "hololive GAMERS", //korone
        "hololive Generation 0", //suisei
    )

    private val talentYoutubes = arrayOf(
        "https://www.youtube.com/channel/UCp6993wxpyDPHUpavwDFqgg", //sora
        "https://www.youtube.com/channel/UCDqI2jOz0weumE8s7paEk6g", //roboco
        "https://www.youtube.com/channel/UCD8HOxPs4Xvsm8H0ZxXGiBw", //mel
        "https://www.youtube.com/channel/UCFTLzh12_nrtzqBPsTCqenA", //aki
        "https://www.youtube.com/channel/UC1CfXB_kRs3C-zaeTG3oGyg", //hachaama
        "https://www.youtube.com/channel/UCdn5BQ06XqgXoAxIhbqw5Rg", //fubuki
        "https://www.youtube.com/channel/UCQ0UDLQCjY0rmuxCDE38FGg", //matsuri
        "https://www.youtube.com/channel/UC1opHUrw8rvnsadT-iGp7Cg", //aqua
        "https://www.youtube.com/channel/UCXTpFs_3PqI41qX2d9tL2Rw", //shion
        "https://www.youtube.com/channel/UC7fk0CB07ly8oSl0aqKkqFg", //ayame
        "https://www.youtube.com/channel/UC1suqwovbL1kzsoaZgFZLKg", //choco
        "https://www.youtube.com/channel/UCvzGlP9oQwU--Y0r9id_jnA", //subaru
        "https://www.youtube.com/channel/UC0TXe_LYZ4scaW2XMyi5_kw", //azki
        "https://www.youtube.com/channel/UCp-5t9SrOQwXMU7iIjQfARg", //mio
        "https://www.youtube.com/channel/UC-hM6YJuNYVAmUWxeIr9FeA", //miko
        "https://www.youtube.com/channel/UCvaTdHTWBGv3MKj3KVqJVCw", //okayu
        "https://www.youtube.com/channel/UChAnqc_AY5_I3Px5dig3X1Q", //korone
        "https://www.youtube.com/channel/UC5CwaMl1eIgY8h02uZw7u8A", //suisei
    )

    private val talentImages = intArrayOf(
        R.drawable.tokino_sora_thumb,
        R.drawable.roboco_list_thumb,
        R.drawable.mel_thumb,
        R.drawable.aki_rosenthal_thumb,
        R.drawable.hachaama_thumb,
        R.drawable.shirakami_fubuki_thumb,
        R.drawable.natsuiro_matsuri_thumb,
        R.drawable.aqua_thumb,
        R.drawable.shion_thumb,
        R.drawable.nakiri_ayame_thumb,
        R.drawable.yuzuki_choco_thumb,
        R.drawable.oozora_subaru_thumb,
        R.drawable.azki_thumb,
        R.drawable.ookami_mio_thumb,
        R.drawable.miko_thumb,
        R.drawable.okayu_thumb,
        R.drawable.inugami_korone_thumb,
        R.drawable.hoshimachi_suisei_thumb,
    )

    val listData: ArrayList<Talent>
        get() {
            val list = arrayListOf<Talent>()
            for (position in talentNames.indices) {
                val talent = Talent()
                talent.name = talentNames[position]
                talent.unit = talentUnits[position]
                talent.jp_name = talentJp_Names[position]
                talent.description = talentDescriptions[position]
                talent.photo = talentImages[position]
                list.add(talent)
            }
            return list
        }
}