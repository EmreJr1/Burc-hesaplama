import java.util.Scanner;

public class burc {
    public static void main(String[] args) {
        int gun;
        String ay;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum gününüzü giriniz :");
        gun = inp.nextInt();
        inp.nextLine();//boş satırı oku

        System.out.print("Doğum ayınızı giriniz :");
        ay = inp.nextLine().toLowerCase();


        if ((gun >= 21 && gun <= 30) && ay.equals("mart") || (gun >= 1 && gun <= 20) && ay.equals("nisan")) {
            System.out.println("Koç burcusunuz!");
            System.out.println("Koç burcu özellikleri:");
            System.out.println("1. Enerjik ve girişimci.");
            System.out.println("2. Rekabetçi ve hedef odaklı.");
            System.out.println("3. Cesur ve atılgan.");
            System.out.println("4. Liderlik özellikleri taşır.");
            System.out.println("5. Sabırsız ve hızlı düşünen.");
            System.out.println("6. Bağımsızlık ve özgürlük sever.");
            System.out.println("7. Tutkulu ve heyecanlı.");
            System.out.println("8. Doğal liderlik yetenekleri vardır.");
            System.out.println("9. Maceracı ve keşfetmeye açıktır.");
            System.out.println("10. Dürüst ve doğrudan ifade eder.");

        } else if ((gun >= 21 && gun <= 30) && ay.equals("nisan") || (1 <= gun && gun <= 20) && ay.equals("mayıs")) {
            System.out.println("Boğa burcusunuz!");
            System.out.println("Boğa burcu özellikleri:");
            System.out.println("1. Sabırlı ve istikrarlı.");
            System.out.println("2. Dürüst ve güvenilir.");
            System.out.println("3. Pratik ve gerçekçi.");
            System.out.println("4. Zevkleri ve konforu önemser.");
            System.out.println("5. Dayanıklı ve güçlü bir karaktere sahiptir.");
            System.out.println("6. Doğayı ve güzellikleri takdir eder.");
            System.out.println("7. Materiyalizme eğilimli olabilir.");
            System.out.println("8. Sadık ve sevgi dolu.");
            System.out.println("9. Kararlı ve azimli.");
            System.out.println("10. Değişime direnç gösterebilir.");

        } else if ((gun >= 22 && gun <= 30) && ay.equals("mayıs") || (1 <= gun && gun <= 22) && ay.equals("haziran")) {
            System.out.println("İkizler burcusunuz!");
            System.out.println("İkizler burcu özellikleri:");
            System.out.println("1. İletişim becerileri güçlü.");
            System.out.println("2. Meraklı ve öğrenmeye açık.");
            System.out.println("3. Esnek ve uyumlu.");
            System.out.println("4. Zeki ve hızlı düşünen.");
            System.out.println("5. Sosyal ve dışa dönük.");
            System.out.println("6. Çok yönlü ve değişken bir kişilik.");
            System.out.println("7. Yaratıcı ve konuşkan.");
            System.out.println("8. Yeni deneyimlere açık.");
            System.out.println("9. Heyecan arayışında.");
            System.out.println("10. Karar vermede zorlanabilir.");

        }else if ((gun >= 23 && gun <= 30) && ay.equals("haziran") || (1 <= gun && gun <= 22) && ay.equals("temmuz")) {
            System.out.println("Yengeç burcusunuz!");
            System.out.println("Yengeç burcu özellikleri:");
            System.out.println("1. Duygusal ve duyarlı.");
            System.out.println("2. Aileye ve ev hayatına önem verir.");
            System.out.println("3. Sevecen ve şefkatli.");
            System.out.println("4. Romantik ve hayalperest.");
            System.out.println("5. İçe dönük ve korumacı.");
            System.out.println("6. Karşıt görüşlere karşı duyarlı olabilir.");
            System.out.println("7. Hassas ve kırılgan.");
            System.out.println("8. Değişime adapte olmakta zorlanabilir.");
            System.out.println("9. Geçmişe bağlılık gösterebilir.");
            System.out.println("10. İnatçı ve kolay kolay affetmez.");

        }else if ((gun >= 23 && gun <= 30) && ay.equals("temmuz") || (1 <= gun && gun <= 22) && ay.equals("ağustos")) {
            System.out.println("Aslan burcusunuz!");
            System.out.println("Aslan burcu özellikleri:");
            System.out.println("1. Kendine güvenen ve karizmatik.");
            System.out.println("2. Liderlik özellikleri taşır.");
            System.out.println("3. Cömert ve gururlu.");
            System.out.println("4. Yaratıcı ve dikkat çekmeyi sever.");
            System.out.println("5. Sıcakkanlı ve sosyal.");
            System.out.println("6. İlgilendiği konularda tutkulu.");
            System.out.println("7. Kendini ifade etmeye önem verir.");
            System.out.println("8. Maceracı ve risk almaktan çekinmez.");
            System.out.println("9. Takdir ve övgüye ihtiyaç duyar.");
            System.out.println("10. Bağımsızlığına önem verir.");

        }else if ((gun >= 23 && gun <= 30) && ay.equals("ağustos") || (1 <= gun && gun <= 22) && ay.equals("eylül")) {
            System.out.println("Başak burcusunuz!");
            System.out.println("Başak burcu özellikleri:");
            System.out.println("1. Detaylara önem verir ve titizdir.");
            System.out.println("2. Analitik düşünme yeteneğine sahiptir.");
            System.out.println("3. Pratik ve düzenli çalışır.");
            System.out.println("4. Eleştirel ve mükemmeliyetçi.");
            System.out.println("5. Yardımsever ve hizmet odaklı.");
            System.out.println("6. Zihinsel olarak aktiftir ve bilgiye açıktır.");
            System.out.println("7. Sağlık ve hijyen konularında hassastır.");
            System.out.println("8. Planlama ve organizasyon becerileri yüksektir.");
            System.out.println("9. İçsel bir disipline sahiptir.");
            System.out.println("10. Çekingen ve utangaç olabilir.");

        }else if ((gun >= 23 && gun <= 30) && ay.equals("eylül") || (1 <= gun && gun <= 22) && ay.equals("ekim")) {
            System.out.println("Terazi burcusunuz!");
            System.out.println("Terazi burcu özellikleri:");
            System.out.println("1. Uyumlu ve adaletli.");
            System.out.println("2. İlişkilerde denge ve uyum arar.");
            System.out.println("3. Zarif ve estetik anlayışa sahiptir.");
            System.out.println("4. Diplomatik ve arabuluculuk yapabilme yeteneği vardır.");
            System.out.println("5. Sosyal ve dost canlısı.");
            System.out.println("6. Çatışmalardan kaçınır ve barışçıl çözümler arar.");
            System.out.println("7. Kararsızlık yaşayabilir ve tercihlerde zorlanabilir.");
            System.out.println("8. Eşitlik ve adalet duygusu yüksektir.");
            System.out.println("9. İlişkilerde dengeli ve uyumlu bir ortam yaratır.");
            System.out.println("10. Çatışmalardan kaçınmak için fedakarlık yapabilir.");

        }else if ((gun >= 23 && gun <= 30) && ay.equals("ekim") || (1 <= gun && gun <= 21) && ay.equals("kasım")) {
            System.out.println("Akrep burcusunuz!");
            System.out.println("Akrep burcu özellikleri:");
            System.out.println("1. Gizemli ve derin düşünceli.");
            System.out.println("2. Güçlü duygusal ve tutkulu.");
            System.out.println("3. Kararlı ve hırslı.");
            System.out.println("4. Bağımsızlık ve kontrol arzusu taşır.");
            System.out.println("5. Analitik ve keskin zekaya sahiptir.");
            System.out.println("6. Gözlem yeteneği güçlüdür.");
            System.out.println("7. Sadakat ve bağlılık önemlidir.");
            System.out.println("8. Gizli güçlere inanabilir ve mistik konulara ilgi duyar.");
            System.out.println("9. Duygularını derinlerde saklar ve açılmakta zorlanabilir.");
            System.out.println("10. Kıskançlık ve intikam duygusu yaşayabilir.");

        }else if ((gun >= 22 && gun <= 30) && ay.equals("kasım") || (1 <= gun && gun <= 21) && ay.equals("aralık")) {
            System.out.println("Yay burcusunuz!");
            System.out.println("Yay burcu özellikleri:");
            System.out.println("1. Özgür ruhlu ve maceraperest.");
            System.out.println("2. Optimist ve pozitif düşünen.");
            System.out.println("3. Geniş bir perspektife sahiptir.");
            System.out.println("4. Cesur ve risk almayı sever.");
            System.out.println("5. Öğrenmeye ve keşfetmeye açıktır.");
            System.out.println("6. Açık fikirli ve hoşgörülüdür.");
            System.out.println("7. Doğa ve seyahat tutkusu vardır.");
            System.out.println("8. İdealist ve adaletli.");
            System.out.println("9. İletişim becerileri yüksektir ve sosyal ilişkilerde başarılıdır.");
            System.out.println("10. Sabırsızlık ve sabit fikirlilik gösterebilir.");

        }else if ((gun >= 22 && gun <= 30) && ay.equals("aralık") || (1 <= gun && gun <= 21) && ay.equals("ocak")) {
            System.out.println("Oğlak burcusunuz!");
            System.out.println("Oğlak burcu özellikleri:");
            System.out.println("1. Disiplinli ve sorumluluk sahibi.");
            System.out.println("2. Hırslı ve çalışkan.");
            System.out.println("3. Sabırlı ve dayanıklı.");
            System.out.println("4. Pratik ve gerçekçi düşünür.");
            System.out.println("5. Güvenilir ve sadık.");
            System.out.println("6. İş hayatında başarılı ve planlı çalışır.");
            System.out.println("7. Geleneklere bağlılık gösterebilir.");
            System.out.println("8. Finansal konulara önem verir ve tasarrufçu olabilir.");
            System.out.println("9. Başarıya odaklanır ve hedeflerine ulaşmak için çaba harcar.");
            System.out.println("10. Duygusal olarak kapalı olabilir ve duygularını göstermekte zorlanabilir.");

        }else if ((gun >= 21 && gun <= 30) && ay.equals("ocak") || (1 <= gun && gun <= 19) && ay.equals("şubat")) {
            System.out.println("Kova burcusunuz!");
            System.out.println("Kova burcu özellikleri:");
            System.out.println("1. Yaratıcı ve özgür ruhlu.");
            System.out.println("2. İnovatif ve ileri görüşlü.");
            System.out.println("3. Bağımsızlık ve özgürlüğe önem verir.");
            System.out.println("4. İnsan hakları ve toplumsal adalet konularında duyarlıdır.");
            System.out.println("5. Sosyal ve arkadaş canlısı.");
            System.out.println("6. İletişim becerileri yüksektir ve grup çalışmalarında başarılıdır.");
            System.out.println("7. Farklı düşünceleri ve çeşitliliği kucaklar.");
            System.out.println("8. Bilimsel ve teknolojik konulara ilgi duyar.");
            System.out.println("9. Özgün ve benzersiz olmaya önem verir.");
            System.out.println("10. Duygusal ifade konusunda bazen zorlanabilir.");

        }else if ((gun >= 20 && gun <= 30) && ay.equals("şubat") || (1 <= gun && gun <= 20) && ay.equals("mart")) {
            System.out.println("Balık burcusunuz!");
            System.out.println("Balık burcu özellikleri:");
            System.out.println("1. Duyarlı ve empati yeteneği yüksek.");
            System.out.println("2. Hayalperest ve sanatsal eğilimlere sahip.");
            System.out.println("3. Romantik ve duygusal.");
            System.out.println("4. Hassas ve anlayışlı.");
            System.out.println("5. İyi dinleyici ve yardımsever.");
            System.out.println("6. Ruhani ve manevi konulara ilgi duyar.");
            System.out.println("7. Yaratıcı düşünme yeteneğine sahip.");
            System.out.println("8. Değişen duygusal durumları olabilir.");
            System.out.println("9. Hayal dünyasında kaybolma eğilimi gösterebilir.");
            System.out.println("10. Sınırları çizmede zorlanabilir ve sık sık fedakarlık yapabilir.");

        }else{
            System.out.println("Geçersiz tarih veya ay girdiniz!");
        }







    }

}
