

//////// NPC Init \\\\

this allowDamage false; this enableSimulation false;this addAction[localize"STR_Process_16",life_fnc_processAction,"16",0,false,false,"",' life_inv_16_unprocessed > 0 && !life_is_processing && !life_action_inUse'];this addAction[format ["%1 ($%2)",localize (getText(missionConfigFile >> "Licenses" >> "16" >> "displayName")), [(getNumber(missionConfigFile >> "Licenses" >> "16" >> "price"))] call life_fnc_numberText],life_fnc_buyLicense,"16",0,false,false,"",' !license_civ_16 && playerSide isEqualTo civilian '];