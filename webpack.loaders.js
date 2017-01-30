
module.exports = [
	{
		test: /\.html$/,
		exclude: /node_modules/,
		use: {
			loader: 'file-loader',
			query: {
				name: '[name].[ext]'
			},
		},
	},
	{
		test: /\.css$/,
		exclude: /node_modules/,
		use: [
			'style-loader',
			'css-loader'
		]
	},
	{
		test: /\.(js|jsx)$/,
		exclude: /node_modules/,
		use: [
			'babel-loader'
		],
	},
];
