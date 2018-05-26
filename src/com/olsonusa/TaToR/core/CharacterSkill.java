package com.olsonusa.TaToR.core;

public class CharacterSkill
{
    public String Name;
    public String Description;
    public boolean Untrained;
    public String Ability;
    private int rank;
    private int classBonus;
    private int abilityMod;
    private int miscMod;
    public int GetSkillValue()
    {
        return rank + classBonus + abilityMod + miscMod;
    }


}
