||||stringtable.xml||||

<Key ID="STR_License_heroin">
			<Original>heroin</Original>
		</Key>
		<Key ID="STR_Process_heroin">
			<Original>heroin</Original>
		</Key>
		<Key ID="STR_Item_heroin_unprocessed">
			<Original>heroin</Original>
		</Key>
		<Key ID="STR_Item_heroin_processed">
			<Original>heroin</Original>
		</Key>

||||Config_Gather.hpp||||

class heroin {
            amount = 123;
            zones[] = {"heroin"};
            item = "";
            zoneSize = 123;
        };

||||Config_Licenses.hpp||||

class heroin {
        variable = "heroin";
        displayName = "STR_License_heroin";
        price = 123;
        illegal = true;
        side = "civ";
	};

||||Config_Process.hpp||||

class heroin {
        MaterialsReq[] = {{ "heroin_unrefined",123}};
        MaterialsGive[] = {{ "heroin_refined",123}};
        Text = "STR_Process_heroin";
        NoLicenseCost = 123;
	};

||||Config_vItems.hpp||||

class heroin {
        variable = "heroin_unprocessed"
        displayName = "STR_Item_heroin_unprocessed"
        weight = 123123;
        buyPrice = 123123;
        sellPrice = 123123;
        illegal = true;
        edible = true;
        icon = "heroin";
	};

	class heroin {
        variable = "heroin_processed"
        displayName = "STR_Item_heroin_processed"
        weight = 123123;
        buyPrice = 123123;
        sellPrice = 1231231;
        illegal = true;
        edible = true;
        icon = "heroin";
	};

||||NPC Init||||

this addAction[localize"STR_Process_heroin",life_fnc_processAction,"heroin",0,false,false,"",' life_inv_heroin_unprocessed > 0 && !life_is_processing && !life_action_inUse'];this addAction[format ["%1 ($%2)",localize (getText(missionConfigFile >> "Licenses" >> "heroin" >> "displayName")), [(getNumber(missionConfigFile >> "Licenses" >> "heroin" >> "price"))] call life_fnc_numberText],life_fnc_buyLicense,"heroin",0,false,false,"",' !license_civ_heroin && playerSide isEqualTo civilian '];