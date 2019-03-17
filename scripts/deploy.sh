#/bin/sh

set -e

envdir ./.env lein do clean, deps, build-site, ftp-static-deploy
