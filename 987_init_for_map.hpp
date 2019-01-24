

//////// NPC Init \\\\

this allowDamage false; this enableSimulation false;this addAction[localize"STR_Process_987",life_fnc_processAction,"987",0,false,false,"",' life_inv_987_unprocessed > 0 && !life_is_processing && !life_action_inUse'];this addAction[format ["%1 ($%2)",localize (getText(missionConfigFile >> "Licenses" >> "987" >> "displayName")), [(getNumber(missionConfigFile >> "Licenses" >> "987" >> "price"))] call life_fnc_numberText],life_fnc_buyLicense,"987",0,false,false,"",' !license_civ_987 && playerSide isEqualTo civilian '];