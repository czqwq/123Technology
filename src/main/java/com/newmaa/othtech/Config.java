package com.newmaa.othtech;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {

    public static String greeting = "Hello World";

    public static void synchronizeConfiguration(File configFile) {

        Configuration configuration = new Configuration(configFile);

        // greeting = configuration.getString("greeting", Configuration.CATEGORY_GENERAL, greeting, "How shall I
        // greet?");
        is_TT_Boom = configuration.getBoolean(
            "OTHTechnology : Control TT Machine Explosion | 控制TT模版机器爆炸",
            "Machine Settings",
            is_TT_Boom,
            "Enable/disable TT template machine explosions | 憋憋");
        NEIFrontend = configuration.getBoolean(
            "OTHTechnology : Use Iridium-Osmium-Samarium Powder in Recipe GUI | 123机器配方池界面使用铱锇钐合金粉替换GT齿轮, true为是, false为替换成憋憋",
            "UI Settings",
            NEIFrontend,
            "true: use Ir-Os-Sm powder instead of GT gears, false: use alternative | true为是, false为替换成憋憋");
        is_MISA_IMBA_Recipes_Enabled = configuration.getBoolean(
            "OTHTechnology : Enable MISA Overpowered Recipes | 艾萨集成工厂超模配方是否开启(e.g. 无尽催化剂矿出无尽粉 黑钚矿出黑中子粉), true为是, false为否",
            "Recipe Settings",
            is_MISA_IMBA_Recipes_Enabled,
            "Enable overpowered recipes in MISA Integrated Factory (e.g. infinite catalyst ore -> infinite dust) | true为是, false为否");
        is_EggMachine_Recipes_For_NHU = configuration.getBoolean(
            "OTHTechnology : Enable NHU Recipes for Egg Machine | 丰矿的NHU配方兼容从123大龙研机(e.g. 一步到位顶级蛋机 龙蛋馄饨龙蛋远古龙蛋配方), true为是, false为否",
            "Recipe Settings",
            is_EggMachine_Recipes_For_NHU,
            "Enable NHU recipes compatibility (e.g. one-step dragon egg recipes) | true为是, false为否");
        ENQING_MULTI = configuration.getFloat(
            "OTHTechnology : Enqing Factory Output Multiplier (float, rounded) | 恩情工厂配方产物倍率(float) , 倍率四舍五入",
            "Multipliers",
            1.5f,
            1.0f,
            114514f,
            "Output multiplier for Enqing Factory recipes (rounded to nearest integer) | 倍率四舍五入");
        tier_Antimonia = configuration.getInt(
            "OTHTechnology : Antimonia Planet Landing Tier Requirement | 锑星登陆需求等级(Tier)",
            "Dimension Settings",
            4,
            1,
            10,
            "Required tier to land on Antimonia planet | 笑笑");
        tier_Ross123b = configuration.getInt(
            "OTHTechnology : Ross123b Planet Landing Tier Requirement | 锑罗斯登陆需求等级(Tier)",
            "Dimension Settings",
            1,
            1,
            10,
            "Required tier to land on Ross123b planet | 笑笑");
        is_Enqing_Song_Play = configuration.getBoolean(
            "OTHTechnology : Enable General Factory Startup Sound | 开启将军工厂的开机音效, true为是, false为否",
            "Audio Settings",
            is_Enqing_Song_Play,
            "Enable/disable General Factory startup sound effect | true为是, false为否");
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }

    public static boolean DEFAULT_BATCH_MODE = false;
    public static boolean NEIFrontend = true;
    public static boolean is_TT_Boom = true;
    public static float ENQING_MULTI = 1.5f;
    public static boolean is_MISA_IMBA_Recipes_Enabled = true;
    public static boolean is_EggMachine_Recipes_For_NHU = true;
    public static int tier_Antimonia = 4;
    public static int tier_Ross123b = 1;
    public static boolean is_Enqing_Song_Play = true;
}
