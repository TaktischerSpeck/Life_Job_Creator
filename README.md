[![GitHub license](https://img.shields.io/github/license/TaktischerSpeck/Life_Job_Creator.svg)](https://github.com/TaktischerSpeck/Life_Job_Creator/edit/master/LICENSE)[![GitHub release](https://img.shields.io/github/release/TaktischerSpeck/Life_Job_Creator.svg)](https://GitHub.com/TaktischerSpeck/Life_Job_Creator/releases/)[![GitHub contributors](https://img.shields.io/github/contributors/Naereen/StrapDown.js.svg)](https://GitHub.com/TaktischerSpeck/Life_Job_Creator/graphs/contributors/)[![GitHub issues](https://img.shields.io/github/issues/TaktischerSpeck/Life_Job_Creator.svg)](https://GitHub.com/TaktischerSpeck/Life_Job_Creator/issues/)

# Life Job Creator

This is a small tool to simply create all config entries for new farming jobs in the [Altis Life RPG Framework](https://github.com/AsYetUntitled/Framework/) by <b>TAW_Tonic</b> and maintained by <b>AsYetUntitled</b>

Version 2 also reads the files and automaticly adds the new content


Table of contents
=================

<!--ts-->
   * [Life Job Creator](#life-job-creator)
   * [Table of contents](#table-of-contents)
   * [Prerequisites](#prerequisites)
   * [Installing](#installing)
   * [Authors](#authors)
   * [License](#license)
<!--te-->

### Prerequisites

Version 5.0 of [Altis Life RPG Framework](https://github.com/AsYetUntitled/Framework/) by <b>TAW_Tonic</b>

Java https://www.java.com/de/download/

### Installing

Simply Install Java and than run the .jar file with Java.

<b>!!IMPORTANT!!

Go in your mission and open the Config_vItems.hpp located in [MISSION]\config\Config_vItems.hpp

At the End of the class VirtualShops you got two lines wich should look like this:
```
    };
};
```
change them to:
```    
    };
    
};
```

Just create an new, Empty line.

It's needed that the tool can separate the VirtualShops class from the VirtualItems class.
</b>
## Authors

* **Taktischer Speck** - *Initial work*
* **blackfisch** - *maintenance*

See also the list of [contributors](https://github.com/TaktischerSpeck/Life_Job_Creato/contributors) who participated in this project.

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE.md](LICENSE.md) file for details
