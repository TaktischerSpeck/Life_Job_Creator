

//////// NPC Init \\\\

this allowDamage false; this enableSimulation false;this addAction[localize"STR_Process_9",life_fnc_processAction,"9",0,false,false,"",' life_inv_9_unprocessed > 0 && !life_is_processing && !life_action_inUse'];this addAction[format ["%1 ($%2)",localize (getText(missionConfigFile >> "Licenses" >> "9" >> "displayName")), [(getNumber(missionConfigFile >> "Licenses" >> "9" >> "price"))] call life_fnc_numberText],life_fnc_buyLicense,"9",0,false,false,"",' !license_civ_9 && playerSide isEqualTo civilian '];