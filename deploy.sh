#!/bin/sh
root_dir=$(cd $(dirname $0); pwd)
view_dir=src/main/view
deploy_html_dir=src/main/resources/templates
deploy_static_dir=src/main/resources/static

# プロジェクトのパスにカレントディレクトリを移動
cd $root_dir

# 画面のビルド
cd $view_dir
npm run build

# デプロイ
cd $root_dir
if [ -d $deploy_html_dir ]; then rm -R $deploy_html_dir/*; fi
if [ -d $deploy_static_dir ]; then rm -R $deploy_static_dir/*; fi
cp -R $view_dir/dist/* $deploy_static_dir/
mkdir -m 777 $deploy_html_dir
mv $deploy_static_dir/index.html $deploy_html_dir/index.html

exit 0
