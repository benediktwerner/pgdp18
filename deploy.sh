#!/bin/bash
JEKYLL_ENV=production bundle exec jekyll build && scp -r _site/* wernerbe@lxhalle.in.tum.de:home_page/html-data/pgdp18/
