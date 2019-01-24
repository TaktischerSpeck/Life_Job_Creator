

//////// NPC Init \\\\

this allowDamage false; this enableSimulation false;this addAction[localize"STR_Process_4",life_fnc_processAction,"4",0,false,false,"",' life_inv_4_unprocessed > 0 && !life_is_processing && !life_action_inUse'];this addAction[format ["%1 ($%2)",localize (getText(missionConfigFile >> "Licenses" >> "4" >> "displayName")), [(getNumber(missionConfigFile >> "Licenses" >> "4" >> "price"))] call life_fnc_numberText],life_fnc_buyLicense,"4",0,false,false,"",' !license_civ_4 && playerSide isEqualTo civilian '];