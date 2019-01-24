

//////// NPC Init \\\\

this allowDamage false; this enableSimulation false;this addAction[localize"STR_Process_897",life_fnc_processAction,"897",0,false,false,"",' life_inv_897_unprocessed > 0 && !life_is_processing && !life_action_inUse'];this addAction[format ["%1 ($%2)",localize (getText(missionConfigFile >> "Licenses" >> "897" >> "displayName")), [(getNumber(missionConfigFile >> "Licenses" >> "897" >> "price"))] call life_fnc_numberText],life_fnc_buyLicense,"897",0,false,false,"",' !license_civ_897 && playerSide isEqualTo civilian '];