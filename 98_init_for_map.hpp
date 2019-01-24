

//////// NPC Init \\\\

this allowDamage false; this enableSimulation false;this addAction[localize"STR_Process_98",life_fnc_processAction,"98",0,false,false,"",' life_inv_98_unprocessed > 0 && !life_is_processing && !life_action_inUse'];this addAction[format ["%1 ($%2)",localize (getText(missionConfigFile >> "Licenses" >> "98" >> "displayName")), [(getNumber(missionConfigFile >> "Licenses" >> "98" >> "price"))] call life_fnc_numberText],life_fnc_buyLicense,"98",0,false,false,"",' !license_civ_98 && playerSide isEqualTo civilian '];