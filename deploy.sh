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
rm -R $deploy_html_dir/*
rm -R $deploy_static_dir/*
cp -R $view_dir/dist/* $deploy_static_dir
mv $deploy_static_dir/index.html $deploy_html_dir/index.html
