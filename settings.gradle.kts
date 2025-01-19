rootProject.name = "db-snap"

include("core")
include("core:application")
include("core:domain")

project(":core:application").name = "application"
project(":core:domain").name = "domain"

include("infrastructure")
include("infrastructure:infrastructure")
include("infrastructure:persistance")
project(":infrastructure:infrastructure").name = "infrastructure"
project(":infrastructure:persistance").name = "persistance"

include("interface")
include("interface:cli")
project(":interface:cli").name = "cli"

