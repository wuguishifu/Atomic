package com.bramerlabs.atomic.utils;

import java.util.ArrayList;

public class AtomicData {

    public static String[] atomName = {
            "Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Fluorine", "Neon",
            "Sodium", "Magnesium", "Aluminum", "Silicon", "Phosphorous", "Sulfur", "Chlorine", "Argon",
            "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron", "Cobalt",
            "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "Krypton", "Rubidium",
            "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "Rhodium",
            "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "Caesium",
            "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium",
            "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium",
            "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead",
            "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "Actinium", "Thorium", "Protactinium",
            "Uranium", "Neptunium", "Plutonium", "Americium", "Curium", "Berkelium", "Californium", "Einsteinium",
            "Fermium", "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium",
            "Hassium", "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium", "Nihonium", "Flerovium", "Moscovium",
            "Livermorium", "Tennissine", "Organesson"
    };

    public static String[] abbAtomName = {
            "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K",
            "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb",
            "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs",
            "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta",
            "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa",
            "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt",
            "Ds", "Rg", "Cn", "Nh", "Fl", "Mc", "Lv", "Ts", "Og"
    };

    public static int[][] isotopes = {
            {1, 2}, {3, 4}, {6, 7}, {9}, {10, 11}, {12, 13}, {14, 15}, {16, 17, 18}, {19}, {20, 21, 22}, {23},
            {24, 25, 26}, {27}, {28, 29, 30}, {31}, {32, 33, 34, 36}, {35, 37}, {36, 38, 40}, {39, 40, 41},
            {40, 42, 43, 44, 46, 48}, {45}, {46, 47, 48, 49, 50}, {50, 51}, {50, 52, 53, 54}, {55}, {54, 56, 57, 58},
            {59}, {58, 60, 61, 62, 64}, {63, 65}, {64, 66, 67, 68, 70}, {69, 71}, {70, 72, 73, 74, 76}, {75},
            {74, 76, 77, 78, 80, 82}, {79, 81}, {78, 80, 82, 83, 84, 86}, {85, 87}, {84, 86, 87, 88}, {89},
            {90, 91, 92, 94, 96}, {92}, {100, 92, 94, 95, 96, 97, 98}, {-1}, {100, 101, 102, 104, 96, 98, 99}, {103},
            {102, 104, 105, 106, 108, 110}, {107, 109}, {106, 108, 110, 111, 112, 113, 114, 116}, {113, 115},
            {112, 114, 115, 116, 117, 118, 119, 120, 122, 124}, {121, 123}, {120, 122, 123, 124, 125, 126, 128, 130},
            {127}, {124, 126, 128, 129, 130, 131, 132, 134, 136}, {133}, {130, 132, 134, 135, 136, 137, 138},
            {138, 139}, {136, 138, 140, 142}, {141}, {142, 143, 144, 145, 146, 148, 150}, {-1},
            {144, 147, 148, 149, 150, 152, 154}, {151, 153}, {152, 154, 155, 156, 157, 158, 160}, {159},
            {156, 158, 160, 161, 162, 163, 164}, {165}, {162, 164, 166, 167, 168, 170}, {169},
            {168, 170, 171, 172, 173, 174, 176}, {175, 176}, {174, 176, 177, 178, 179, 180}, {181},
            {180, 182, 183, 184, 186}, {185, 187}, {184, 186, 187, 188, 189, 190, 192}, {191, 193},
            {190, 192, 194, 195, 196, 19}, {197}, {196, 198, 199, 200, 201, 202, 204}, {203, 205}, {204, 206, 207, 208},
            {209}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {232}, {-1}, {234, 235, 238}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1},
            {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1}, {-1},
            {-1}, {-1}
    };

    public static float[][] abundance = {
            {0.9999f, 0.0001f}, {0.00f, 1.0000f}, {0.0759f, 0.9241f}, {1}, {0.1990f, 0.8010f}, {0.9893f, 0.0107f},
            {0.9963f, 0.0037f}, {0.9976f, 0.0004f, 0.0021f}, {1}, {0.9048f, 0.0027f, 0.0925f}, {1},
            {0.7899f, 0.10f, 0.1101f}, {1}, {0.9223f, 0.0468f, 0.0309f}, {1}, {0.9493f, 0.0076f, 0.0429f, 0.0002f},
            {0.7578f, 0.2422f}, {0.0034f, 0.0006f, 0.9960f}, {0.9326f, 0.0001f, 0.0673f},
            {0.9694f, 0.0065f, 0.0014f, 0.0209f, 0.0000f, 0.0019f}, {1},
            {0.0825f, 0.0744f, 0.7372f, 0.0541f, 0.0518f}, {0.0025f, 0.9975f}, {0.0435f, 0.8379f, 0.0950f, 0.0237f},
            {1}, {0.0585f, 0.9175f, 0.0212f, 0.0028f}, {1}, {0.6808f, 0.2622f, 0.0114f, 0.0363f, 0.0093f},
            {0.6917f, 0.3083f}, {0.4863f, 0.2790f, 0.0410f, 0.1875f, 0.0062f}, {0.6011f, 0.3989f},
            {0.2084f, 0.2754f, 0.0773f, 0.3628f, 0.0761f}, {1}, {0.0089f, 0.0937f, 0.0763f, 0.2377f, 0.4961f, 0.0873f},
            {0.5069f, 0.4931f}, {0.0035f, 0.0228f, 0.1158f, 0.1149f, 0.57f, 0.1730f}, {0.7217f, 0.2783f},
            {0.0056f, 0.0986f, 0.07f, 0.8258f}, {1}, {0.5145f, 0.1122f, 0.1715f, 0.1738f, 0.0280f}, {1},
            {0.0963f, 0.1484f, 0.0925f, 0.1592f, 0.1668f, 0.0955f, 0.2413f}, {-1},
            {0.1260f, 0.1706f, 0.3155f, 0.1862f, 0.054f, 0.0187f, 0.1276f}, {1},
            {0.0102f, 0.1114f, .2233f, 0.2733f, 0.2646f, 0.1172f}, {0.5148f, 0.4816f},
            {0.0125f, 0.0089f, 0.1249f, 0.1280f, 0.2413f, 0.1222f, 0.2873f, 0.0749f}, {0.0429f, 0.9571f},
            {0.0097f, 0.0066f, 0.0034f, 0.1454f, 0.0768f, 0.2422f, 0.0859f, 0.3258f, 0.0463f, 0.0579f},
            {0.5721f, 0.4279f}, {0.0009f, 0.0255f, 0.0089f, 0.0474f, 0.0707f, 0.1884f, 0.3174f, 0.3408f},
            {1}, {0.0009f, 0.0009f, 0.0192f, 0.2644f, 0.0408f, 0.2118f, 0.2689f, 0.1044f, 0.0887f}, {1},
            {0.0011f, 0.0010f, 0.0242f, 0.0659f, 0.0785f, 0.1123f, 0.7170f}, {0.0009f, 0.9991f},
            {0.0019f, 0.0025f, 0.8845f, 0.1111f}, {1}, {0.2720f, 0.1220f, 0.2380f, 0.0830f, 0.1720f, 0.0570f, 0.056f},
            {0.0307f, 0.1499f, 0.1124f, 0.1382f, 0.0738f, 0.2675f, 0.2275f}, {0.4781f, 0.5219f},
            {0.0020f, 0.0218f, 0.1480f, 0.2047f, 0.1565f, 0.2484f, 0.2186f}, {1},
            {0.0006f, 0.0010f, 0.0234f, 0.1891f, 0.2551f, 0.2490f, 0.2818f}, {1},
            {0.0014f, 0.0161f, 0.3361f, 0.2293f, 0.2678f, 0.1493f}, {1},
            {0.0013f, 0.0304f, 0.1428f, 0.2183f, 0.1613f, 0.3183f, 0.1276f},
            {0.9741f, 0.0259f}, {0.0016f, 0.0526f, 0.1860f, 0.2728f, 0.1362f, 0.3508f}, {0.9999f},
            {0.0012f, 0.2650f, 0.1431f, 0.3064f, 0.2843f}, {0.3740f, 0.6260f},
            {0.0002f, 0.0159f, 0.0196f, 0.1324f, 0.1615f, 0.2626f, 0.4078f}, {0.3730f, 0.6270f},
            {0.0001f, 0.0078f, 0.3297f, 0.3383f, 0.2524f, 0.0716f}, {1},
            {0.0015f, 0.0997f, 0.1687f, 0.2310f, 0.1318f, 0.2986f, 0.0687f}, {0.2952f, 0.7048f},
            {0.0140f, 0.2410f, 0.2210f, 0.5240f}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1},
            {0.0001f, 0.0072f, 0.9927f}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1},
            {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1},
    };
}