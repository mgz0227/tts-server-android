package com.github.jing332.tts_server_android.constant

object CnLocalMap {
    fun getStyleAndRole(key: String): String = ""

    fun getEdgeVoice(key: String): String {
        return edgeVoice.getOrDefault(key, key)
    }

    private val edgeVoice = mapOf(
        "af-ZA-AdriNeural" to "Adri",
        "af-ZA-WillemNeural" to "Willem",
        "am-ET-AmehaNeural" to "አምሀ",
        "am-ET-MekdesNeural" to "መቅደስ",
        "ar-AE-FatimaNeural" to "فاطمة",
        "ar-AE-HamdanNeural" to "حمدان",
        "ar-BH-AliNeural" to "علي",
        "ar-BH-LailaNeural" to "ليلى",
        "ar-DZ-AminaNeural" to "أمينة",
        "ar-DZ-IsmaelNeural" to "إسماعيل",
        "ar-EG-SalmaNeural" to "سلمى",
        "ar-EG-ShakirNeural" to "شاكر",
        "ar-IQ-BasselNeural" to "باسل",
        "ar-IQ-RanaNeural" to "رنا",
        "ar-JO-SanaNeural" to "سناء",
        "ar-JO-TaimNeural" to "تيم",
        "ar-KW-FahedNeural" to "فهد",
        "ar-KW-NouraNeural" to "نورا",
        "ar-LB-LaylaNeural" to "ليلى",
        "ar-LB-RamiNeural" to "رامي",
        "ar-LY-ImanNeural" to "إيمان",
        "ar-LY-OmarNeural" to "أحمد",
        "ar-MA-JamalNeural" to "جمال",
        "ar-MA-MounaNeural" to "منى",
        "ar-OM-AbdullahNeural" to "عبدالله",
        "ar-OM-AyshaNeural" to "عائشة",
        "ar-QA-AmalNeural" to "أمل",
        "ar-QA-MoazNeural" to "معاذ",
        "ar-SA-HamedNeural" to "حامد",
        "ar-SA-ZariyahNeural" to "زارية",
        "ar-SY-AmanyNeural" to "أماني",
        "ar-SY-LaithNeural" to "ليث",
        "ar-TN-HediNeural" to "هادي",
        "ar-TN-ReemNeural" to "ريم",
        "ar-YE-MaryamNeural" to "مريم",
        "ar-YE-SalehNeural" to "صالح",
        "az-AZ-BabekNeural" to "Babək",
        "az-AZ-BanuNeural" to "Banu",
        "bg-BG-BorislavNeural" to "Борислав",
        "bg-BG-KalinaNeural" to "Калина",
        "bn-BD-NabanitaNeural" to "নবনীতা",
        "bn-BD-PradeepNeural" to "প্রদ্বীপ",
        "bn-IN-BashkarNeural" to "ভাস্কর",
        "bn-IN-TanishaaNeural" to "তানিশা",
        "bs-BA-GoranNeural" to "Goran",
        "bs-BA-VesnaNeural" to "Vesna",
        "ca-ES-JoanaNeural" to "Joana",
        "ca-ES-AlbaNeural" to "Alba",
        "ca-ES-EnricNeural" to "Enric",
        "cs-CZ-An:ninNeural" to "An:nín",
        "cs-CZ-VlastaNeural" to "Vlasta",
        "cy-GB-AledNeural" to "Aled",
        "cy-GB-NiaNeural" to "Nia",
        "da-DK-ChristelNeural" to "Christel",
        "da-DK-JeppeNeural" to "Jeppe",
        "de-AT-IngridNeural" to "Ingrid",
        "de-AT-JonasNeural" to "Jonas",
        "de-CH-JanNeural" to "Jan",
        "de-CH-LeniNeural" to "Leni",
        "de-DE-KatjaNeural" to "Katja",
        "de-DE-AmalaNeural" to "Amala",
        "de-DE-BerndNeural" to "Bernd",
        "de-DE-Chris:phNeural" to "Chris:ph",
        "de-DE-ConradNeural" to "Conrad",
        "de-DE-ElkeNeural" to "Elke",
        "de-DE-GiselaNeural" to "Gisela",
        "de-DE-KasperNeural" to "Kasper",
        "de-DE-KillianNeural" to "Killian",
        "de-DE-KlarissaNeural" to "Klarissa",
        "de-DE-KlausNeural" to "Klaus",
        "de-DE-LouisaNeural" to "Louisa",
        "de-DE-MajaNeural" to "Maja",
        "de-DE-RalfNeural" to "Ralf",
        "de-DE-TanjaNeural" to "Tanja",
        "el-GR-AthinaNeural" to "Αθηνά",
        "el-GR-Nes:rasNeural" to "Νέστορας",
        "en-AU-NatashaNeural" to "Natasha",
        "en-AU-WilliamNeural" to "William",
        "en-AU-AnnetteNeural" to "Annette",
        "en-AU-CarlyNeural" to "Carly",
        "en-AU-DarrenNeural" to "Darren",
        "en-AU-DuncanNeural" to "Duncan",
        "en-AU-ElsieNeural" to "Elsie",
        "en-AU-FreyaNeural" to "Freya",
        "en-AU-JoanneNeural" to "Joanne",
        "en-AU-KenNeural" to "Ken",
        "en-AU-KimNeural" to "Kim",
        "en-AU-NeilNeural" to "Neil",
        "en-AU-TimNeural" to "Tim",
        "en-AU-TinaNeural" to "Tina",
        "en-CA-ClaraNeural" to "Clara",
        "en-CA-LiamNeural" to "Liam",
        "en-GB-LibbyNeural" to "Libby",
        "en-GB-AbbiNeural" to "Abbi",
        "en-GB-AlfieNeural" to "Alfie",
        "en-GB-BellaNeural" to "Bella",
        "en-GB-ElliotNeural" to "Elliot",
        "en-GB-EthanNeural" to "Ethan",
        "en-GB-HollieNeural" to "Hollie",
        "en-GB-MaisieNeural" to "Maisie",
        "en-GB-NoahNeural" to "Noah",
        "en-GB-OliverNeural" to "Oliver",
        "en-GB-OliviaNeural" to "Olivia",
        "en-GB-ThomasNeural" to "Thomas",
        "en-GB-RyanNeural" to "Ryan",
        "en-GB-SoniaNeural" to "Sonia",
        "en-GB-MiaNeural" to "Mia",
        "en-HK-SamNeural" to "Sam",
        "en-HK-YanNeural" to "Yan",
        "en-IE-ConnorNeural" to "Connor",
        "en-IE-EmilyNeural" to "Emily",
        "en-IN-NeerjaNeural" to "Neerja",
        "en-IN-PrabhatNeural" to "Prabhat",
        "en-KE-AsiliaNeural" to "Asilia",
        "en-KE-ChilembaNeural" to "Chilemba",
        "en-NG-AbeoNeural" to "Abeo",
        "en-NG-EzinneNeural" to "Ezinne",
        "en-NZ-MitchellNeural" to "Mitchell",
        "en-NZ-MollyNeural" to "Molly",
        "en-PH-JamesNeural" to "James",
        "en-PH-RosaNeural" to "Rosa",
        "en-SG-LunaNeural" to "Luna",
        "en-SG-WayneNeural" to "Wayne",
        "en-TZ-ElimuNeural" to "Elimu",
        "en-TZ-ImaniNeural" to "Imani",
        "en-US-JennyNeural" to "Jenny",
        "en-US-JennyMultilingualNeural" to "Jenny Multilingual",
        "en-US-GuyNeural" to "Guy",
        "en-US-AmberNeural" to "Amber",
        "en-US-AnaNeural" to "Ana",
        "en-US-AriaNeural" to "Aria",
        "en-US-AshleyNeural" to "Ashley",
        "en-US-BrandonNeural" to "Brandon",
        "en-US-Chris:pherNeural" to "Chris:pher",
        "en-US-CoraNeural" to "Cora",
        "en-US-ElizabethNeural" to "Elizabeth",
        "en-US-EricNeural" to "Eric",
        "en-US-JacobNeural" to "Jacob",
        "en-US-MichelleNeural" to "Michelle",
        "en-US-MonicaNeural" to "Monica",
        "en-US-SaraNeural" to "Sara",
        "en-US-AIGenerate1Neural" to "AIGenerate1",
        "en-US-AIGenerate2Neural" to "AIGenerate2",
        "en-US-DavisNeural" to "Davis",
        "en-US-JaneNeural" to "Jane",
        "en-US-JasonNeural" to "Jason",
        "en-US-NancyNeural" to "Nancy",
        "en-US-RogerNeural" to "Roger",
        "en-US-SteffanNeural" to "Steffan",
        "en-US-:nyNeural" to "tony",
        "en-ZA-LeahNeural" to "Leah",
        "en-ZA-LukeNeural" to "Luke",
        "es-AR-ElenaNeural" to "Elena",
        "es-AR-:masNeural" to "tomas",
        "es-BO-MarceloNeural" to "Marcelo",
        "es-BO-SofiaNeural" to "Sofia",
        "es-CL-CatalinaNeural" to "Catalina",
        "es-CL-LorenzoNeural" to "Lorenzo",
        "es-CO-GonzaloNeural" to "Gonzalo",
        "es-CO-SalomeNeural" to "Salome",
        "es-CR-JuanNeural" to "Juan",
        "es-CR-MariaNeural" to "María",
        "es-CU-BelkysNeural" to "Belkys",
        "es-CU-ManuelNeural" to "Manuel",
        "es-DO-EmilioNeural" to "Emilio",
        "es-DO-RamonaNeural" to "Ramona",
        "es-EC-AndreaNeural" to "Andrea",
        "es-EC-LuisNeural" to "Luis",
        "es-ES-ElviraNeural" to "Elvira",
        "es-ES-AbrilNeural" to "Abril",
        "es-ES-AlvaroNeural" to "Álvaro",
        "es-ES-ArnauNeural" to "Arnau",
        "es-ES-DarioNeural" to "Dario",
        "es-ES-EliasNeural" to "Elias",
        "es-ES-EstrellaNeural" to "Estrella",
        "es-ES-IreneNeural" to "Irene",
        "es-ES-LaiaNeural" to "Laia",
        "es-ES-LiaNeural" to "Lia",
        "es-ES-NilNeural" to "Nil",
        "es-ES-SaulNeural" to "Saul",
        "es-ES-TeoNeural" to "Teo",
        "es-ES-TrianaNeural" to "Triana",
        "es-ES-VeraNeural" to "Vera",
        "es-GQ-JavierNeural" to "Javier",
        "es-GQ-TeresaNeural" to "Teresa",
        "es-GT-AndresNeural" to "Andrés",
        "es-GT-MartaNeural" to "Marta",
        "es-HN-CarlosNeural" to "Carlos",
        "es-HN-KarlaNeural" to "Karla",
        "es-MX-DaliaNeural" to "Dalia",
        "es-MX-BeatrizNeural" to "Beatriz",
        "es-MX-CandelaNeural" to "Candela",
        "es-MX-CarlotaNeural" to "Carlota",
        "es-MX-CecilioNeural" to "Cecilio",
        "es-MX-GerardoNeural" to "Gerardo",
        "es-MX-JorgeNeural" to "Jorge",
        "es-MX-LarissaNeural" to "Larissa",
        "es-MX-Liber:Neural" to "Liber:",
        "es-MX-LucianoNeural" to "Luciano",
        "es-MX-MarinaNeural" to "Marina",
        "es-MX-NuriaNeural" to "Nuria",
        "es-MX-PelayoNeural" to "Pelayo",
        "es-MX-RenataNeural" to "Renata",
        "es-MX-YagoNeural" to "Yago",
        "es-NI-FedericoNeural" to "Federico",
        "es-NI-YolandaNeural" to "Yolanda",
        "es-PA-MargaritaNeural" to "Margarita",
        "es-PA-Rober:Neural" to "Rober:",
        "es-PE-AlexNeural" to "Alex",
        "es-PE-CamilaNeural" to "Camila",
        "es-PR-KarinaNeural" to "Karina",
        "es-PR-Vic:rNeural" to "Víc:r",
        "es-PY-MarioNeural" to "Mario",
        "es-PY-TaniaNeural" to "Tania",
        "es-SV-LorenaNeural" to "Lorena",
        "es-SV-RodrigoNeural" to "Rodrigo",
        "es-US-AlonsoNeural" to "Alonso",
        "es-US-PalomaNeural" to "Paloma",
        "es-UY-MateoNeural" to "Mateo",
        "es-UY-ValentinaNeural" to "Valentina",
        "es-VE-PaolaNeural" to "Paola",
        "es-VE-SebastianNeural" to "Sebastián",
        "et-EE-AnuNeural" to "Anu",
        "et-EE-KertNeural" to "Kert",
        "eu-ES-AinhoaNeural" to "Ainhoa",
        "eu-ES-AnderNeural" to "Ander",
        "fa-IR-DilaraNeural" to "دلارا",
        "fa-IR-FaridNeural" to "فرید",
        "fi-FI-SelmaNeural" to "Selma",
        "fi-FI-HarriNeural" to "Harri",
        "fi-FI-NooraNeural" to "Noora",
        "fil-PH-AngeloNeural" to "Angelo",
        "fil-PH-BlessicaNeural" to "Blessica",
        "fr-BE-CharlineNeural" to "Charline",
        "fr-BE-GerardNeural" to "Gerard",
        "fr-CA-SylvieNeural" to "Sylvie",
        "fr-CA-An:ineNeural" to "An:ine",
        "fr-CA-JeanNeural" to "Jean",
        "fr-CH-ArianeNeural" to "Ariane",
        "fr-CH-FabriceNeural" to "Fabrice",
        "fr-FR-AlainNeural" to "Alain",
        "fr-FR-BrigitteNeural" to "Brigitte",
        "fr-FR-CelesteNeural" to "Celeste",
        "fr-FR-ClaudeNeural" to "Claude",
        "fr-FR-CoralieNeural" to "Coralie",
        "fr-FR-EloiseNeural" to "Eloise",
        "fr-FR-JacquelineNeural" to "Jacqueline",
        "fr-FR-JeromeNeural" to "Jerome",
        "fr-FR-JosephineNeural" to "Josephine",
        "fr-FR-MauriceNeural" to "Maurice",
        "fr-FR-YvesNeural" to "Yves",
        "fr-FR-YvetteNeural" to "Yvette",
        "fr-FR-DeniseNeural" to "Denise",
        "fr-FR-HenriNeural" to "Henri",
        "ga-IE-ColmNeural" to "Colm",
        "ga-IE-OrlaNeural" to "Orla",
        "gl-ES-RoiNeural" to "Roi",
        "gl-ES-SabelaNeural" to "Sabela",
        "gu-IN-DhwaniNeural" to "ધ્વની",
        "gu-IN-NiranjanNeural" to "નિરંજન",
        "he-IL-AvriNeural" to "אברי",
        "he-IL-HilaNeural" to "הילה",
        "hi-IN-MadhurNeural" to "मधुर",
        "hi-IN-SwaraNeural" to "स्वरा",
        "hr-HR-GabrijelaNeural" to "Gabrijela",
        "hr-HR-SreckoNeural" to "Srećko",
        "hu-HU-NoemiNeural" to "Noémi",
        "hu-HU-TamasNeural" to "Tamás",
        "hy-AM-AnahitNeural" to "Անահիտ",
        "hy-AM-HaykNeural" to "Հայկ",
        "id-ID-ArdiNeural" to "Ardi",
        "id-ID-GadisNeural" to "Gadis",
        "is-IS-GudrunNeural" to "Guðrún",
        "is-IS-GunnarNeural" to "Gunnar",
        "it-IT-IsabellaNeural" to "Isabella",
        "it-IT-ElsaNeural" to "Elsa",
        "it-IT-BenignoNeural" to "Benigno",
        "it-IT-CalimeroNeural" to "Calimero",
        "it-IT-CataldoNeural" to "Cataldo",
        "it-IT-DiegoNeural" to "Diego",
        "it-IT-FabiolaNeural" to "Fabiola",
        "it-IT-FiammaNeural" to "Fiamma",
        "it-IT-GianniNeural" to "Gianni",
        "it-IT-ImeldaNeural" to "Imelda",
        "it-IT-IrmaNeural" to "Irma",
        "it-IT-LisandroNeural" to "Lisandro",
        "it-IT-PalmiraNeural" to "Palmira",
        "it-IT-PierinaNeural" to "Pierina",
        "it-IT-RinaldoNeural" to "Rinaldo",
        "ja-JP-NanamiNeural" to "七海",
        "ja-JP-KeitaNeural" to "圭太",
        "ja-JP-AoiNeural" to "碧衣",
        "ja-JP-DaichiNeural" to "大智",
        "ja-JP-MayuNeural" to "真夕",
        "ja-JP-NaokiNeural" to "直紀",
        "ja-JP-ShioriNeural" to "志織",
        "jv-ID-DimasNeural" to "Dimas",
        "jv-ID-SitiNeural" to "Siti",
        "ka-GE-EkaNeural" to "ეკა",
        "ka-GE-GiorgiNeural" to "გიორგი",
        "kk-KZ-AigulNeural" to "Айгүл",
        "kk-KZ-DauletNeural" to "Дәулет",
        "km-KH-PisethNeural" to "ពិសិដ្ឋ",
        "km-KH-SreymomNeural" to "ស្រីមុំ",
        "kn-IN-GaganNeural" to "ಗಗನ್",
        "kn-IN-SapnaNeural" to "ಸಪ್ನಾ",
        "ko-KR-SunHiNeural" to "선히",
        "ko-KR-InJoonNeural" to "인준",
        "ko-KR-BongJinNeural" to "봉진",
        "ko-KR-GookMinNeural" to "국민",
        "ko-KR-JiMinNeural" to "지민",
        "ko-KR-SeoHyeonNeural" to "서현",
        "ko-KR-SoonBokNeural" to "순복",
        "ko-KR-YuJinNeural" to "유진",
        "lo-LA-ChanthavongNeural" to "ຈັນທະວົງ",
        "lo-LA-KeomanyNeural" to "ແກ້ວມະນີ",
        "lt-LT-LeonasNeural" to "Leonas",
        "lt-LT-OnaNeural" to "Ona",
        "lv-LV-EveritaNeural" to "Everita",
        "lv-LV-NilsNeural" to "Nils",
        "mk-MK-AleksandarNeural" to "Александар",
        "mk-MK-MarijaNeural" to "Марија",
        "ml-IN-MidhunNeural" to "മിഥുൻ",
        "ml-IN-SobhanaNeural" to "ശോഭന",
        "mn-MN-BataaNeural" to "Батаа",
        "mn-MN-YesuiNeural" to "Есүй",
        "mr-IN-AarohiNeural" to "आरोही",
        "mr-IN-ManoharNeural" to "मनोहर",
        "ms-MY-OsmanNeural" to "Osman",
        "ms-MY-YasminNeural" to "Yasmin",
        "mt-MT-GraceNeural" to "Grace",
        "mt-MT-JosephNeural" to "Joseph",
        "my-MM-NilarNeural" to "နီလာ",
        "my-MM-ThihaNeural" to "သီဟ",
        "nb-NO-PernilleNeural" to "Pernille",
        "nb-NO-FinnNeural" to "Finn",
        "nb-NO-IselinNeural" to "Iselin",
        "ne-NP-HemkalaNeural" to "हेमकला",
        "ne-NP-SagarNeural" to "सागर",
        "nl-BE-ArnaudNeural" to "Arnaud",
        "nl-BE-DenaNeural" to "Dena",
        "nl-NL-ColetteNeural" to "Colette",
        "nl-NL-FennaNeural" to "Fenna",
        "nl-NL-MaartenNeural" to "Maarten",
        "pl-PL-AgnieszkaNeural" to "Agnieszka",
        "pl-PL-MarekNeural" to "Marek",
        "pl-PL-ZofiaNeural" to "Zofia",
        "ps-AF-GulNawazNeural" to " ګل نواز",
        "ps-AF-LatifaNeural" to "لطيفه",
        "pt-BR-FranciscaNeural" to "Francisca",
        "pt-BR-An:nioNeural" to "Antônio",
        "pt-BR-BrendaNeural" to "Brenda",
        "pt-BR-Dona:Neural" to "Dona:",
        "pt-BR-ElzaNeural" to "Elza",
        "pt-BR-FabioNeural" to "Fabio",
        "pt-BR-GiovannaNeural" to "Giovanna",
        "pt-BR-Humber:Neural" to "Humber:",
        "pt-BR-JulioNeural" to "Julio",
        "pt-BR-LeilaNeural" to "Leila",
        "pt-BR-LeticiaNeural" to "Leticia",
        "pt-BR-ManuelaNeural" to "Manuela",
        "pt-BR-NicolauNeural" to "Nicolau",
        "pt-BR-ValerioNeural" to "Valerio",
        "pt-BR-YaraNeural" to "Yara",
        "pt-PT-DuarteNeural" to "Duarte",
        "pt-PT-FernandaNeural" to "Fernanda",
        "pt-PT-RaquelNeural" to "Raquel",
        "ro-RO-AlinaNeural" to "Alina",
        "ro-RO-EmilNeural" to "Emil",
        "ru-RU-SvetlanaNeural" to "Светлана",
        "ru-RU-DariyaNeural" to "Дария",
        "ru-RU-DmitryNeural" to "Дмитрий",
        "si-LK-SameeraNeural" to "සමීර",
        "si-LK-ThiliniNeural" to "තිළිණි",
        "sk-SK-LukasNeural" to "Lukáš",
        "sk-SK-Vik:riaNeural" to "Viktória",
        "sl-SI-PetraNeural" to "Petra",
        "sl-SI-RokNeural" to "Rok",
        "so-SO-MuuseNeural" to "Muuse",
        "so-SO-UbaxNeural" to "Ubax",
        "sq-AL-AnilaNeural" to "Anila",
        "sq-AL-IlirNeural" to "Ilir",
        "sr-RS-NicholasNeural" to "Никола",
        "sr-RS-SophieNeural" to "Софија",
        "su-ID-JajangNeural" to "Jajang",
        "su-ID-TutiNeural" to "Tuti",
        "sv-SE-SofieNeural" to "Sofie",
        "sv-SE-HilleviNeural" to "Hillevi",
        "sv-SE-MattiasNeural" to "Mattias",
        "sw-KE-RafikiNeural" to "Rafiki",
        "sw-KE-ZuriNeural" to "Zuri",
        "sw-TZ-DaudiNeural" to "Daudi",
        "sw-TZ-RehemaNeural" to "Rehema",
        "ta-IN-PallaviNeural" to "பல்லவி",
        "ta-IN-ValluvarNeural" to "வள்ளுவர்",
        "ta-LK-KumarNeural" to "குமார்",
        "ta-LK-SaranyaNeural" to "சரண்யா",
        "ta-MY-KaniNeural" to "கனி",
        "ta-MY-SuryaNeural" to "சூர்யா",
        "ta-SG-AnbuNeural" to "அன்பு",
        "ta-SG-VenbaNeural" to "வெண்பா",
        "te-IN-MohanNeural" to "మోహన్",
        "te-IN-ShrutiNeural" to "శ్రుతి",
        "th-TH-PremwadeeNeural" to "เปรมวดี",
        "th-TH-AcharaNeural" to "อัจฉรา",
        "th-TH-NiwatNeural" to "นิวัฒน์",
        "tr-TR-AhmetNeural" to "Ahmet",
        "tr-TR-EmelNeural" to "Emel",
        "uk-UA-OstapNeural" to "Остап",
        "uk-UA-PolinaNeural" to "Поліна",
        "ur-IN-GulNeural" to "گل",
        "ur-IN-SalmanNeural" to "سلمان",
        "ur-PK-AsadNeural" to "اسد",
        "ur-PK-UzmaNeural" to "عظمیٰ",
        "uz-UZ-MadinaNeural" to "Madina",
        "uz-UZ-SardorNeural" to "Sardor",
        "vi-VN-HoaiMyNeural" to "Hoài My",
        "vi-VN-NamMinhNeural" to "Nam Minh",
        "wuu-CN-Xiao:ngNeural" to "晓彤",
        "wuu-CN-YunzheNeural" to "云哲",
        "yue-CN-XiaoMinNeural" to "晓敏",
        "yue-CN-YunSongNeural" to "云松",
        "zh-CN-XiaoxiaoNeural" to "晓晓",
        "zh-CN-YunyangNeural" to "云扬",
        "zh-CN-XiaochenNeural" to "晓辰",
        "zh-CN-XiaohanNeural" to "晓涵",
        "zh-CN-XiaomoNeural" to "晓墨",
        "zh-CN-XiaoqiuNeural" to "晓秋",
        "zh-CN-XiaoruiNeural" to "晓睿",
        "zh-CN-XiaoshuangNeural" to "晓双",
        "zh-CN-XiaoxuanNeural" to "晓萱",
        "zh-CN-XiaoyanNeural" to "晓颜",
        "zh-CN-XiaoyouNeural" to "晓悠",
        "zh-CN-YunxiNeural" to "云希",
        "zh-CN-YunyeNeural" to "云野",
        "zh-CN-XiaomengNeural" to "晓梦",
        "zh-CN-XiaoyiNeural" to "晓伊",
        "zh-CN-XiaozhenNeural" to "晓甄",
        "zh-CN-YunfengNeural" to "云枫",
        "zh-CN-YunhaoNeural" to "云皓",
        "zh-CN-YunjianNeural" to "云健",
        "zh-CN-YunxiaNeural" to "云夏",
        "zh-CN-YunzeNeural" to "云泽",
        "zh-CN-henan-YundengNeural" to "云登",
        "zh-CN-liaoning-XiaobeiNeural" to "晓北",
        "zh-CN-shaanxi-XiaoniNeural" to "晓妮",
        "zh-CN-shandong-YunxiangNeural" to "云翔",
        "zh-CN-sichuan-YunxiNeural" to "云希",
        "zh-HK-HiuMaanNeural" to "曉曼",
        "zh-HK-HiuGaaiNeural" to "曉佳",
        "zh-HK-WanLungNeural" to "雲龍",
        "zh-TW-HsiaoChenNeural" to "曉臻",
        "zh-TW-HsiaoYuNeural" to "曉雨",
        "zh-TW-YunJheNeural" to "雲哲",
        "zu-ZA-ThandoNeural" to "Thando",
        "zu-ZA-ThembaNeural" to "Themba"
    )

}