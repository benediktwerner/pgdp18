#!/bin/bash
JEKYLL_ENV=production bundle exec jekyll build && rsync -tz --info=progress2 -r _site/* wernerbe@lxhalle.in.tum.de:home_page/html-data/pgdp18/
